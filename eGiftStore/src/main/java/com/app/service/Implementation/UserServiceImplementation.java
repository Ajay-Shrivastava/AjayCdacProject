package com.app.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Gifts;
import com.app.entities.User;
import com.app.repository.GiftsRepository;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private GiftsRepository giftsRepository;
	
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<Gifts> findAllGifts() {
		return giftsRepository.findAll();
	}
}
