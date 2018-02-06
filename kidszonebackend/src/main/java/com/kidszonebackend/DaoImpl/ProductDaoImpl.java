package com.kidszonebackend.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kidszonebackend.Dao.ProductDao;
import com.kidszonebackend.Model.Product;
@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void insertProduct(Product product) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

}
