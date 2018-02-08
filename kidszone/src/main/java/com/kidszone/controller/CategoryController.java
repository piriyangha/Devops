package com.kidszone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value = "/categorylist")
	public String showAllCategory(Model model) {
		List<Category> category = categoryDao.getAllCategories();
		model.addAttribute("category", category);
		return "categorylist";
	}
	@RequestMapping(value = "/all/deletecategory/{cid}")
	public String deleteCategory(@PathVariable int cid) {
		categoryDao.deleteCategory(cid);
		return "redirect:/categorylist";
	}
	@RequestMapping(value = { "/all/category/editform/{cid}" })
	public String editForm(@PathVariable int cid, Model model) {
		Category category=categoryDao.getCategoryById(cid);
		
		model.addAttribute("cat",category);
		return "updatecategory";
	}
	@RequestMapping(value = { "/all/category/updatecategory" })
	public String updateSupplier(@ModelAttribute(name = "category") Category category, Model model) {
        model.addAttribute("cat",category);
        categoryDao.updateCategory(category);
		return "redirect:/categorylist";
	}

}
