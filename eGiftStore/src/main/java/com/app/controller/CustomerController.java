package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Gifts;
import com.app.service.UserService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/allGifts")
	public List<Gifts> findAllGifts(){
		return userService.findAllGifts();
	}
	
	
}
