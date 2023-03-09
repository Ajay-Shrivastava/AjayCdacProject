package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entities.Gifts;

public interface GiftsService {
	
	public List<Gifts> getAllGifts();
	public Optional<Gifts> getGiftById(Long id);
	public void deleteGiftsById(Long id);

}
