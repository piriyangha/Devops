package com.kidszonebackend.Dao;

import com.kidszonebackend.Model.CartItem;

public interface CartItemDao {
	public void deleteCartItem(int cartitemid);
	public CartItem getCartItemById(int pid,int cartid);
	public CartItem getCartItemByCartItemId(int cartitemid);

}
