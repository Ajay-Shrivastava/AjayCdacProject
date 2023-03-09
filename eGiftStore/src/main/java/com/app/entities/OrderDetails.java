package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetails extends BaseEntity {
	
	private int quantity;
	private double totalPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private Order order;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gift_id")
	private Gifts gift;
	

	public OrderDetails(int quantity, double totalPrice, Gifts gift) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.gift = gift;
	}


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


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Gifts getGift() {
		return gift;
	}


	public void setGift(Gifts gift) {
		this.gift = gift;
	}
	
	

}
