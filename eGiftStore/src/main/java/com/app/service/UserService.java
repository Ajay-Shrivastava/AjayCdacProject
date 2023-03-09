package com.app.service;

import java.util.List;

import com.app.entities.Gifts;

public interface UserService {	
	public void deleteUserById(Long id);
	public List<Gifts> findAllGifts();

}
