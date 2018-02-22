package com.kidszonebackend.Dao;

import com.kidszonebackend.Model.CartItem;
import com.kidszonebackend.Model.ShippingAddress;

public interface CartItemDao {
	public void deleteCartItem(int cartitemid);
	public CartItem getCartItemById(int pid,int cartid);
	public CartItem getCartItemByCartItemId(int cartitemid);
	
	public void insertShippingAddress(ShippingAddress address);

}
