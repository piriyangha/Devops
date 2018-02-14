package com.kidszone.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.kidszonebackend.Dao.CategoryDao;
import com.kidszonebackend.Dao.ProductDao;
import com.kidszonebackend.Dao.SupplierDao;
import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;

@Controller
public class ProductController {
	@Autowired
	ProductDao productDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	SupplierDao supplierDao;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value= {"/saveproduct"})
	public String saveProduct(@ModelAttribute("pro") Product product) {
		
		/*MultipartFile image=product.getImage();
		String imagepath=request.getServletContext().getRealPath("/resource/images");
		System.out.println("---------Directory:-------"+imagepath);
		Path path=Paths.get(imagepath + File.separator + product.getPid()+".jpg");
		System.out.println("-------Path:-----"+path.toString());*/
		productDao.insertProduct(product);
		/*try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
		return "redirect:/productlist";
		}
	@RequestMapping(value= {"/productlist"})
	public String showAllProduct(Model model) {
		List<Product> product = productDao.getAllProducts();
		model.addAttribute("product", product);
		return "productlist";
	}
	@RequestMapping(value = "/all/deleteProduct/{pid}")
	public String deleteProduct(@PathVariable int pid) {
		productDao.deleteProduct(pid);
		return "redirect:/ProductList";
	}

	@RequestMapping(value = { "/all/product/viewProduct/{pid}" })
	public String viewProduct(@PathVariable int pid, Model model) {
		Product product = productDao.getProductById(pid);
		model.addAttribute("product", product);
		return "viewProduct";
	}

	@RequestMapping(value = { "/all/product/editform/{pid}" })
	public String editForm(@PathVariable int pid, Model model) {
		model.addAttribute("cat", categoryDao.getAllCategories());
		model.addAttribute("supp", supplierDao.getAllSuppliers());
		Product product = productDao.getProductById(pid);
		model.addAttribute("products", product);
		return "updateProduct";
	}

}
