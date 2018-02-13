package com.kidszone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kidszonebackend.Dao.UserDao;
import com.kidszonebackend.Model.User;

@Controller
public class UserController {
@Autowired
UserDao userDao;
	@RequestMapping(value= {"/register"})
	public String registerPage(Model model)
	{
		model.addAttribute("user",new User());
		return "register";
	}
	@RequestMapping(value= {"/saveregister"})
	public String saveRegister(@ModelAttribute("user") User user)
	{  
		userDao.insertValues(user);
	    System.out.println("user information gets inserted");
		return "Login";
	}

}
