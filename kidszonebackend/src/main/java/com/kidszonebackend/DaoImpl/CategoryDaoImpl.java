package com.kidszonebackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kidszonebackend.Dao.CategoryDao;
import com.kidszonebackend.Model.Category;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategory(int cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getCategoryById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

}
