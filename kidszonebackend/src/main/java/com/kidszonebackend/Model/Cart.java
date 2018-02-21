package com.kidszonebackend.Model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int cartid;
@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private List<CartItem> cartItems;
private double grandTotal;
@OneToOne
private User user;
/*@OneToOne
private BillingAddress billing;*/
private int qty;

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public int getCartid() {
	return cartid;
}

public void setCartid(int cartid) {
	this.cartid = cartid;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public List<CartItem> getCartItems() {
	return cartItems;
}

public void setCartItems(List<CartItem> cartItems) {
	this.cartItems = cartItems;
}

public double getGrandTotal() {
	return grandTotal;
}

public void setGrandTotal(double grandTotal) {
	this.grandTotal = grandTotal;
}


}
