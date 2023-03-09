package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "carts")
public class GiftCart extends BaseEntity {
	
	private int totalItems;
	private double totalCartPrice;
	@CreationTimestamp
	private LocalDate createdOn;
	@UpdateTimestamp
	private LocalDate updatedOn;
	
	
	//One customer has to be associated with one cart
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private User currentCartUser;

	//One Gift Cart will have multiple number of Gift Items
	@OneToMany(mappedBy = "myCart", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemsInCart> cartItems = new ArrayList<>();

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public double getTotalCartPrice() {
		return totalCartPrice;
	}

	public void setTotalCartPrice(double totalCartPrice) {
		this.totalCartPrice = totalCartPrice;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public User getCurrentCartUser() {
		return currentCartUser;
	}

	public void setCurrentCartUser(User currentCartUser) {
		this.currentCartUser = currentCartUser;
	}

	public List<ItemsInCart> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<ItemsInCart> cartItems) {
		this.cartItems = cartItems;
	}
	
}
