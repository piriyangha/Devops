package com.kidszonebackend.Dao;

import java.util.List;

import com.kidszonebackend.Model.Cart;



public interface CartDao {
	public void saveOrUpdateCart(Cart cart);
	public Cart getCartById(int cartid);
	public Cart getCartItemByUser(int pid,String username);
	public List<Cart> getCartByUser(String username);
	public void deleteCart(int cartId);

}
