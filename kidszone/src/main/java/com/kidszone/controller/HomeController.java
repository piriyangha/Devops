package com.kidszone.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kidszonebackend.Dao.CategoryDao;
import com.kidszonebackend.Dao.SupplierDao;
import com.kidszonebackend.Model.Category;
import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;

@Controller
public class HomeController {
@Autowired
	CategoryDao categoryDao;
@Autowired
SupplierDao supplierDao;
	@RequestMapping(value = { "/","/home" })
	public String homePage(Model model) {
		/*try {
		map.addAttribute("category", categoryDao.getAllCategories());
		map.addAttribute("supplier", supplierDao.getAllSuppliers());
		}catch(Exception e) {
			e.printStackTrace();
		}
		map.addAttribute("supp",new Supplier());
		map.addAttribute("pro",new Product());
		map.addAttribute("cat",new Category());*/
		model.addAttribute("supp",new Supplier());
		model.addAttribute("pro",new Product());
		model.addAttribute("cat",new Category());
		model.addAttribute("category", categoryDao.getAllCategories());
		model.addAttribute("supplier", supplierDao.getAllSuppliers());
		
		return "home";
	}
	
	
}
