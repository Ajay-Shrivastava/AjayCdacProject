package com.app.service.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Gifts;
import com.app.repository.GiftsRepository;
import com.app.service.GiftsService;

@Service
public class GiftsServiceImplementation implements GiftsService{
	
	@Autowired
	GiftsRepository giftRepository;
	
	public List<Gifts> getAllGifts(){
		return giftRepository.findAll();
	}
	
	public Optional<Gifts> getGiftById(Long id) {
		return giftRepository.findById(id);
	}
	public void deleteGiftsById(Long id) {
		giftRepository.deleteById(id);
	}

}
