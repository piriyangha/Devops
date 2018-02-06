package com.kidszone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kidszonebackend.Dao.ProductDao;
import com.kidszonebackend.Model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value= {"/saveproduct"})
	public String saveProduct(@ModelAttribute("pro") Product product) {
		productDao.insertProduct(product);
		return "productlist";
		
		
		
		
	}

}
