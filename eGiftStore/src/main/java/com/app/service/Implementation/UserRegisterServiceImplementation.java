package com.app.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.User;
import com.app.repository.UserRegisterRepository;
import com.app.service.UserRegisterService;

@Service
public class UserRegisterServiceImplementation implements UserRegisterService{

	@Autowired
	private UserRegisterRepository userRegRepository;
	@Override
	public User addUser(User user) {
		return userRegRepository.save(user);
	}

}
