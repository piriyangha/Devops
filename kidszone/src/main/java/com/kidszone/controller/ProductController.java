package com.kidszone.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


import com.kidszonebackend.Dao.ProductDao;
import com.kidszonebackend.Model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao productDao;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value= {"/saveproduct"})
	public String saveProduct(@ModelAttribute("pro") Product product) {
		productDao.insertProduct(product);
		MultipartFile image=product.getImage();
		String imagepath=request.getServletContext().getRealPath("/resource/images");
		System.out.println("---------Directory:-------"+imagepath);
		Path path=Paths.get(imagepath + File.separator + product.getPid()+".jpg");
		System.out.println("-------Path:-----"+path.toString());
		try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
		return "productlist";
		
		
		
		
	}

}
