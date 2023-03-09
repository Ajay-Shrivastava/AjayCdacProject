package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "userstbl")
public class User extends BaseEntity {

	private String firstName;
	private String lastName;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String mobile;
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Role role;
	
	@OneToOne(mappedBy = "currentCartUser",cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name="customer_id")
	private GiftCart myCart;
	
	public void addCart(GiftCart cart)
	{
		setMyCart(cart);
		cart.setCurrentCartUser(this);
	}
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, String mobile, String password,String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.role = Role.valueOf(role.toUpperCase());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public GiftCart getMyCart() {
		return myCart;
	}

	public void setMyCart(GiftCart myCart) {
		this.myCart = myCart;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", role=" + role + " ]";
	}
	

}
