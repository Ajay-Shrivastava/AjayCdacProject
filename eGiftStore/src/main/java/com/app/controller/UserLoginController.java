package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.LoginUser;
import com.app.entities.Role;
import com.app.entities.User;
import com.app.service.UserAuthenticationService;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class UserLoginController {
	
	@Autowired
	private UserAuthenticationService userAuthService;
	
	@GetMapping("/loginUser{email}{password}{role}")
	public User loginCustomer(String email,String password,Role role) {
		return userAuthService.FindUserByEmailByPasswordByRole(email, password, role);
	}
	
	@PostMapping("/auth")
	public String auth(@RequestBody LoginUser user) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "true";
	} 

}
