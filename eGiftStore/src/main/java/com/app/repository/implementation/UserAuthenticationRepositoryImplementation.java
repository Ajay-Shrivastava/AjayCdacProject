package com.app.repository.implementation;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.BeanDefinitionDsl.Role;
import org.springframework.stereotype.Repository;

import com.app.entities.User;
import com.app.repository.UserAuthenticationRepository;

@Repository
public class UserAuthenticationRepositoryImplementation implements UserAuthenticationRepository {
	
	@Autowired
	private EntityManager manager;

	@Override
	public User authenticateUser(String email, String pwd, com.app.entities.Role role) {
		String jpql="select u from User u where u.email=:em and u.password=:pwd and u.role=:rl";
		return manager.createQuery(jpql,User.class)
				.setParameter("em",email)
				.setParameter("pwd",pwd)
				.setParameter("rl",role)
				.getSingleResult();
	}
}
