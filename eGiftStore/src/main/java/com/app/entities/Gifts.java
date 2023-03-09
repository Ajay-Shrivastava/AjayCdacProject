package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="gifts")
public class Gifts extends BaseEntity {

	@Column(length = 20,unique = true)
	private String giftName;
	private double giftPrice;
	@Column(length = 500)
	private String giftDescription;
	@Column(name="in_stock")
	private boolean inStock;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id" ,nullable = false)
	private GiftCategory giftCategory;
	
//	@ManyToMany
//	@JoinColumn(name = "occassion_id" ,nullable = false )
//	private List<GiftOccassion> giftOccassion=new ArrayList();

	public Gifts() {
	}

	
	public Gifts(String giftName, double giftPrice, String giftDescription) {
		super();
		this.giftName = giftName;
		this.giftPrice = giftPrice;
		this.giftDescription = giftDescription;
		this.inStock=true;
	}


	public String getGiftName() {
		return giftName;
	}


	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}


	public double getGiftPrice() {
		return giftPrice;
	}


	public void setGiftPrice(double giftPrice) {
		this.giftPrice = giftPrice;
	}


	public String getGiftDescription() {
		return giftDescription;
	}


	public void setGiftDescription(String giftDescription) {
		this.giftDescription = giftDescription;
	}


	public boolean isInStock() {
		return inStock;
	}


	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}


	public GiftCategory getGiftCategory() {
		return giftCategory;
	}


	public void setGiftCategory(GiftCategory giftCategory) {
		this.giftCategory = giftCategory;
	}


//	public List<GiftOccassion> getGiftOccassion() {
//		return giftOccassion;
//	}
//
//
//	public void setGiftOccassion(List<GiftOccassion> giftOccassion) {
//		this.giftOccassion = giftOccassion;
//	}


	@Override
	public String toString() {
		return "Gifts [giftName=" + giftName + ", giftPrice=" + giftPrice + ", giftDescription=" + giftDescription
				+ ", inStock=" + inStock + "]";
	}
	
}
