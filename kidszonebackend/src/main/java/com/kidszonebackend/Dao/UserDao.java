package com.kidszonebackend.Dao;

import com.kidszonebackend.Model.User;

public interface UserDao {
	
	public boolean insertValues(User user);
	public User getUserByUserId(int userId);
	public User getUserByUsername(String username);
	

}
