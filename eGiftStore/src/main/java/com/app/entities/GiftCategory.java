package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="gift_categories")
public class GiftCategory extends BaseEntity{

	@Column(name="category_name",length = 30,unique = true)
	private String categoryName;
	
	@OneToMany(mappedBy = "giftCategory", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Gifts> gifts=new ArrayList<>();
	
	
	public GiftCategory() {
	}
	
	public GiftCategory(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	

	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public List<Gifts> getGifts() {
		return gifts;
	}


	public void setGifts(List<Gifts> gifts) {
		this.gifts = gifts;
	}

	
	public void addGifts(Gifts gift) {
		//Establish link from gift to GiftCategory
		gift.setGiftCategory(this);
		//Establish link from GiftCategory to gift
		gifts.add(gift);
	}
	
	
	public void removeGifts(Gifts gift)
	{
		//Remove link from gift to GiftCategory
		gift.setGiftCategory(null);
		//Remove link from GiftCategory to gift
		gifts.remove(gift);
	}


	@Override
	public String toString() {
		return "GiftCategory [categoryName=" + categoryName + ", gifts=" + gifts + "]";
	}
	
}
