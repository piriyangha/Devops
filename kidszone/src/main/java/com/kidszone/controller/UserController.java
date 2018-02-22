package com.kidszone.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kidszonebackend.Dao.CategoryDao;
import com.kidszonebackend.Dao.SupplierDao;
import com.kidszonebackend.Dao.UserDao;
import com.kidszonebackend.Model.Category;
import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;
import com.kidszonebackend.Model.User;

@Controller
public class UserController {
@Autowired
UserDao userDao;
@Autowired
CategoryDao categoryDao;
@Autowired
SupplierDao supplierDao;
	@RequestMapping(value= {"/register"})
	public String registerPage(Model model)
	{
		model.addAttribute("supp",new Supplier());
		model.addAttribute("pro",new Product());
		model.addAttribute("cat",new Category());
		model.addAttribute("category", categoryDao.getAllCategories());
		model.addAttribute("supplier", supplierDao.getAllSuppliers());
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
	public String saveRegister(@Valid @ModelAttribute("user") User user,BindingResult result, Model model)
	{   
		if(result.hasErrors())
		{
			return "redirect:/register";
		}
		
		user.setEnabled(true);
        user.setRole("ROLE_USER");
		userDao.insertValues(user);
	    System.out.println("user information gets inserted");
		return "Login";
	}

}
