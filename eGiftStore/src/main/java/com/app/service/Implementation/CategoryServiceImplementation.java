package com.app.service.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.GiftCategory;
import com.app.repository.CategoryRepository;
import com.app.service.CategoryService;

@Service
public class CategoryServiceImplementation implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<GiftCategory> getAllCategory(){
		return categoryRepository.findAll();
	}
	
	public GiftCategory addCategory(GiftCategory category) {
		return categoryRepository.save(category);
	}
	
	public void deleteCategoryById(Long id) {
		categoryRepository.deleteById(id);
	}
	
	public Optional<GiftCategory> getCategoryById(Long id) {
		return categoryRepository.findById(id);
	}

}
