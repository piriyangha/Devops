package com.kidszone.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kidszonebackend.Dao.UserDao;
import com.kidszonebackend.Model.User;

@Controller
public class HomeController {
	
	@Autowired
	UserDao userDao;
	@Autowired
	User user;
@RequestMapping(value= {"/"})
public String homePage()
{
	return "home";
}
/*@RequestMapping("/addUser")
public String addUser(@RequestParam Map<String,String>user1, Model m) {
	
    
	user.setEmail(user1.get("email"));
	user.setAddress(user1.get("address"));
	user.setName(user1.get("name"));
	user.setPassword(user1.get("password"));
	user.setPhone(user1.get("phone"));
	
	if(userDao.insertValues(user))
		return "redirect:index";
	return "index";
}*/
}

