package com.kidszonebackend.Dao;

import java.util.List;

import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;


public interface ProductDao {
	 public Boolean insertProduct(Product product);
	 public List<Product> getAllProducts();
	 public Boolean deleteProduct(int pid);//for project
	 public Supplier getProductById(int pid);
	 public Boolean updateProduct(Product product);

}
