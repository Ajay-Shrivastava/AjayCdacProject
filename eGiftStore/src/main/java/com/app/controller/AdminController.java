package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.GiftCategoryAdd;
import com.app.entities.GiftCategory;
import com.app.entities.Gifts;
import com.app.service.CategoryService;
import com.app.service.GiftsService;
import com.app.service.UserService;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	@Autowired
	private ModelMapper mapper;
	@Autowired
	CategoryService categoryService;

	//-----------------------------------------------------------------------------------------
	//Admin controlling the Category section
	
	@GetMapping("/getAllCategories")
	public List<GiftCategory> getCategory() {
		return categoryService.getAllCategory();
	}
	
	@PostMapping("/addCategory")
	public GiftCategory getCategoryAdd(@RequestBody GiftCategoryAdd newCategory) {
		GiftCategory category=mapper.map(newCategory,GiftCategory.class);
		return categoryService.addCategory(category);
	}
	
	@GetMapping("/getCategoryById{id}")
	public Optional<GiftCategory> getCategoryById(Long id) {
		return categoryService.getCategoryById(id);
	}
	
	//For deleting the category on admin discretion
	@DeleteMapping("/deleteCategory{id}")
	public void deleteCategoryById(Long id) {
		categoryService.deleteCategoryById(id);
	}
	
	//---------------------------------------------------------------------------------------
	//Admin controlling the Shopkeeper section
	
	@Autowired
	UserService userService;
	
	@DeleteMapping("/deleteShopkeeper{id}")
	public void deleteShopkeeperById(Long id) {
		userService.deleteUserById(id);
	}
	
	//----------------------------------------------------------------------------------------
	//Admin controlling the Gift section
	
	@Autowired
	GiftsService giftsService;
	
	@GetMapping("/getAllGifts")
	public List<Gifts> getAllGifts() {
		return giftsService.getAllGifts();
	}
	
	@DeleteMapping("/deleteGifts{id}")
	public void deleteGiftsById(Long id) {
		categoryService.deleteCategoryById(id);
	}
	
	@PutMapping("/gifts{id}")
	public void updateGifts(Gifts gift,Long id) {
		
	}
	
	
	
	
}
