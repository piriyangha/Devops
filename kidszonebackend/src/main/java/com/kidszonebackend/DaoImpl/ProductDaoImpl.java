package com.kidszonebackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kidszonebackend.Dao.ProductDao;
import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;
@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Boolean insertProduct(Product product) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}
	@Override
	public List<Product> getAllProducts() {
		
		return null;
	}
	@Override
	public Boolean deleteProduct(int pid) {
		return true;
		
	}
	@Override
	public Supplier getProductById(int pid) {
		
		return null;
	}
	@Override
	public Boolean updateProduct(Product product) {
		return true;
		
	}

}
