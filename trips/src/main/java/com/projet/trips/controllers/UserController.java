package com.projet.trips.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projet.trips.Dto.UserDto;
import com.projet.trips.request.UserRequest;
import com.projet.trips.response.UserResponse;
import com.projet.trips.services.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
//	@PreAuthorize("hasRole('ADMIN')")
	public List<UserResponse> allUsers(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "5") int limit) {
		List<UserResponse> userResponses = new ArrayList<>();
		List<UserDto> users = userService.getUsers(page, limit);
		for (UserDto userDto : users){
			UserResponse user = new UserResponse();
			BeanUtils.copyProperties(userDto, user);
			userResponses.add(user);
			System.out.println(user);
		}
		return userResponses;
	}

	@GetMapping(path = "{IdUser}")
	public ResponseEntity<UserResponse> getUserById(@PathVariable String IdUser) {
		UserDto userDto = userService.getUserByUserId(IdUser);
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(userDto, userResponse);
		return new ResponseEntity<>(userResponse, HttpStatus.OK);
	}

	@PutMapping(path = "/update/{username}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<UserResponse> updateUser(@PathVariable String username, @RequestBody UserRequest userRequest) {
		UserDto userDto =new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		UserDto updateUser = userService.updateUser(username, userDto);
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(updateUser, userResponse);
		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.ACCEPTED);
	}


	@DeleteMapping(path = "/delete/{username}")
//	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> deleteUser(@PathVariable String username){
		userService.deleteUser(username);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
