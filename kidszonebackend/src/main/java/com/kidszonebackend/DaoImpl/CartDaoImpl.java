package com.kidszonebackend.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kidszonebackend.Dao.CartDao;
import com.kidszonebackend.Model.Cart;
import com.kidszonebackend.Model.Category;
import com.kidszonebackend.Model.Product;

@Repository("cartDao")
public class CartDaoImpl implements CartDao{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveOrUpdateCart(Cart cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}

	@Override
	public Cart getCartById(int id) {
		return (Cart)sessionFactory.getCurrentSession().get(Cart.class, id);
		
	}

	@Override
	public Cart getCartItemByUser(int pid,String username) {
		return (Cart)sessionFactory.getCurrentSession().createQuery("from Cart where cartProductId=:pid and User.name=:username",Cart.class);
		
	}

	@Override
	public List<Cart> getCartByUser(String name) {
		
		return sessionFactory.getCurrentSession().createQuery("from Cart", Cart.class).list();
	}

	@Override
	public void deleteCart(int cartId) {
		Session session=sessionFactory.getCurrentSession();
         session.delete(session.get(Cart.class, cartId));	
	}

}
