package com.app.repository;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserAuthenticationRepository{

		User authenticateUser(String email, String pwd, Role role);
}