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
		
		return sessionFactory.getCurrentSession().createQuery("from Product", Product.class).list();
	}
	@Override
	public Boolean deleteProduct(int pid) {
		sessionFactory.getCurrentSession().delete(getProductById(pid));
		return true;
		
	}
	@Override
	public Product getProductById(int pid) {
		return (Product)sessionFactory.getCurrentSession().get(Product.class, pid);
	}
	@Override
	public Product getProductByCatId(int cid) {
			return (Product)sessionFactory.getCurrentSession().get(Product.class, cid);
	}
	@Override
	public Boolean updateProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
		
	}
	

}
