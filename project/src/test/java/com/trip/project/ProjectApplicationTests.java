package com.trip.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.trip.project.Controllers.AuthController;
import com.trip.project.request.SignupRequest;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	private AuthController authController;

	@Test
	public void testHomeController() {
		SignupRequest request = new SignupRequest("douae","chihaja@gmail.com", "chihaja", "0777227772");
		String result = authController.registerUser(request);
		assertEquals(result, "User registered successfully!");
	}
	


}
