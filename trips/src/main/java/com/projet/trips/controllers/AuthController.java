package com.projet.trips.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projet.trips.Details.UserDetailsImpl;
import com.projet.trips.Dto.UserDto;
import com.projet.trips.models.ConfirmationToken;
import com.projet.trips.models.User;
import com.projet.trips.repository.ConfirmationTokenRepository;
import com.projet.trips.repository.RoleRepository;
import com.projet.trips.repository.UserRepository;
import com.projet.trips.request.LoginRequest;
import com.projet.trips.request.SignupRequest;
import com.projet.trips.response.JwtResponse;
import com.projet.trips.response.MessageResponse;
import com.projet.trips.securty.jwt.JwtUtils;
import com.projet.trips.services.UserService;


@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	private UserService userService;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	JwtUtils jwtUtils;

	@Autowired
	ConfirmationTokenRepository confirmationTokenRepository;

	@PostMapping(value = "/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(new JwtResponse(jwt,
												 userDetails.getId(),
												 userDetails.getUsername(),
												 userDetails.getEmail(),
												 roles));
	}


	@PostMapping("/signup")
	public String registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(signUpRequest, userDto);
		userService.createUser(userDto);
		return "User registered successfully!";
	}


	@RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<?> confirmUserAccount(@RequestParam("token")String confirmationToken) {
		ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

		if(token != null) {
			User user = userRepository.findByEmail(token.getUserEntity().getEmail());
			user.setEmailVerificationStatus(true);
			userRepository.save(user);
			confirmationTokenRepository.delete(token);
			return ResponseEntity.ok(new MessageResponse("user account is verified"));
		} else {
			return ResponseEntity.ok(new MessageResponse("The link is invalid or broken!"));
		}
	}
}