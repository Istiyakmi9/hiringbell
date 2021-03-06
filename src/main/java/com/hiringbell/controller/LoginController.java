package com.hiringbell.controller;

import com.hiringbell.entity.Login;
import com.hiringbell.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/{userId}")
	public User GetUserById(@PathVariable("userId") String userId) {
		var user = this.loginService.getUserById(userId);

		return user;
	}

	@GetMapping("/auth")
	public User AuthUser(Login login) {

		return null;
	}

	@PostMapping("/AuthenticateUser")
	public User AuthenticateUser(@RequestBody Login login) throws Exception {
		var result = this.loginService.AuthenticateUserService(login);
		
		return result;
	}

}
