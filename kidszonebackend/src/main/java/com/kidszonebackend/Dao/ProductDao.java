package com.kidszonebackend.Dao;

import java.util.List;

import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.Supplier;


public interface ProductDao {
	 public Boolean insertProduct(Product product);
	 public List<Product> getAllProducts();
	 public Boolean deleteProduct(int pid);//for project
	 public Product getProductById(int pid);
	 public Product getProductByCatId(int cid);
	 public Boolean updateProduct(Product product);

}
