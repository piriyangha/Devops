package com.kidszonebackend.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.kidszonebackend.Dao.UserDao;
import com.kidszonebackend.Model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public boolean insertValues(User user) {
		try {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public User getUserByUserId(int userId) {
		return sessionFactory.getCurrentSession().get(User.class, userId);
	}
	
	@Override
	public User getUserByUsername(String username) {
		User user = (User) sessionFactory.getCurrentSession().createQuery("FROM User WHERE username = '" + username + "'").uniqueResult();
		return user;
	}

}
