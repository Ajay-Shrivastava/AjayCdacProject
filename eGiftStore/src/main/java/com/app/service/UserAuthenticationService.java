package com.app.service;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserAuthenticationService {
	
	public User FindUserByEmailByPasswordByRole(String email,String password,Role role);

}
