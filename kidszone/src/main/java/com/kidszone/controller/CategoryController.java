package com.kidszone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kidszonebackend.Dao.CategoryDao;
import com.kidszonebackend.Model.Category;
import com.kidszonebackend.Model.Supplier;

@Controller
public class CategoryController {
	@Autowired
	CategoryDao categoryDao;
	@RequestMapping(value= {"/savecategory"})
	public String saveSupplierDetails(@ModelAttribute("cat") Category category) {
		categoryDao.insertCategory(category);
		return "redirect:/categorylist";
		
	}
	

}
