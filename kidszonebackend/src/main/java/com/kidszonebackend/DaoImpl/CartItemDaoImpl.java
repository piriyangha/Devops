package com.kidszonebackend.DaoImpl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kidszonebackend.Dao.CartItemDao;
import com.kidszonebackend.Model.CartItem;

@Repository("cartitemDao")
@Transactional
public class CartItemDaoImpl implements CartItemDao{

@Autowired
SessionFactory sessionFactory;
	@Override
	public void deleteCartItem(int cartitemid) {
		sessionFactory.getCurrentSession().delete(getCartItemByCartItemId(cartitemid));
		
	}

	@Override
	public CartItem getCartItemById(int pid, int cartid) {
		
		return (CartItem) sessionFactory.getCurrentSession().createQuery("FROM CartItem WHERE product_pid = '"+pid+"' AND  cart_cartid = '"+cartid+"'").uniqueResult();
	
	}

	@Override
	public CartItem getCartItemByCartItemId(int cartitemid) {
		
		return (CartItem)sessionFactory.getCurrentSession().get(CartItem.class,cartitemid);
	}

}
