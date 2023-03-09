package com.app.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Role;
import com.app.entities.User;
import com.app.repository.UserAuthenticationRepository;
import com.app.repository.implementation.UserAuthenticationRepositoryImplementation;
import com.app.service.UserAuthenticationService;

@Service
public class UserAuthenticationServiceImplementation implements UserAuthenticationService{
	
	@Autowired
	private UserAuthenticationRepository userAuthRepo;
	
	public User FindUserByEmailByPasswordByRole(String email,String password,Role role) {
		return userAuthRepo.authenticateUser(email, password, role);
	}
}
