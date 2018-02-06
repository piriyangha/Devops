package com.kidszone.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;

@Controller
public class HomeController {

	

	@RequestMapping(value = { "/" })
	public String homePage(ModelMap map) {
		map.addAttribute("supp", new Supplier());
		map.addAttribute("pro",new Product());
		
		return "home";
	}
	/*@RequestMapping(value = {"/admin"})
	public String adminPage() {
		return "AdminAdding";
	}*/

}
