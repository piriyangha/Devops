package com.kidszonebackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kidszonebackend.Dao.CategoryDao;
import com.kidszonebackend.Model.Category;
import com.kidszonebackend.Model.Supplier;
@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao{
@Autowired
SessionFactory sessionFactory;

	@Override
	public void insertCategory(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		
	}

	@Override
	public List<Category> getAllCategories() {
		return sessionFactory.getCurrentSession().createQuery("from Category", Category.class).list();
		
	}

	@Override
	public void deleteCategory(int cid) {
		sessionFactory.getCurrentSession().delete(getCategoryById(cid));
		
	}

	@Override
	public Category getCategoryById(int cid) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, cid);
		
	}

	@Override
	public void updateCategory(Category category) {
		try {
		sessionFactory.getCurrentSession().update(category);
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

}
