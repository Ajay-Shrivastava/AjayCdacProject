package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entities.GiftCategory;

public interface CategoryService {

	public List<GiftCategory> getAllCategory();
	public GiftCategory addCategory(GiftCategory category);
	public void deleteCategoryById(Long id);
	public Optional<GiftCategory> getCategoryById(Long id);
}
