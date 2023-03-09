package com.app.controller;

import javax.servlet.http.HttpServletResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserAdd;
import com.app.entities.GiftCategory;
import com.app.entities.Role;
import com.app.entities.User;
import com.app.service.UserRegisterService;

@RestController
@RequestMapping("/register")
@CrossOrigin
public class UserRegistrationController {
	
	@Autowired
	UserRegisterService userRegService;
	@Autowired
	private ModelMapper mapper;
	
	//@CrossOrigin(origins = "http://localhost:3000")
	//@PostMapping(value = "/addUser", consumes = {"application/json"})
	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody User newUser) {
		
		userRegService.addUser(newUser);
		return ResponseEntity.ok(newUser);
	} 

}
