package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items_in_cart")
public class ItemsInCart extends BaseEntity {
	private int quantity;
	private double totalPrice;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private GiftCart myCart;
	@OneToOne
	@JoinColumn(name = "product_id")
	private Gifts gifts;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public GiftCart getMyCart() {
		return myCart;
	}
	public void setMyCart(GiftCart myCart) {
		this.myCart = myCart;
	}
	public Gifts getGifts() {
		return gifts;
	}
	public void setGifts(Gifts gifts) {
		this.gifts = gifts;
	}
	
	
}
