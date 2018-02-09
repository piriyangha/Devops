package com.kidszonebackend.Dao;

import java.util.List;

import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;


public interface ProductDao {
	 public void insertProduct(Product product);
	 public List<Product> getAllProducts();
	 public void deleteProduct(int pid);//for project
	 public Supplier getProductById(int pid);
	 public void updateProduct(Product product);

}
