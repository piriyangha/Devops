package com.kidszone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping(value = "/login")
	public String loginPage(@RequestParam(required=false)boolean Login, Model model)
	{
		if(Login==false)
		{
		    model.addAttribute("error","login failed");
		}
		else
		{
			model.addAttribute("error",null);
		}
		return "Login";
	}
	@RequestMapping(value= {"/saveregister"})
	public String saveRegister(@ModelAttribute("user") User user)
	{   
		user.setEnabled(true);
        user.setRole("ROLE_USER");
		userDao.insertValues(user);
	    System.out.println("user information gets inserted");
		return "Login";
	}

}
