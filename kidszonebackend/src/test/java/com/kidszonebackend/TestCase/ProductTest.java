package com.kidszonebackend.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kidszonebackend.Dao.ProductDao;
import com.kidszonebackend.Model.Product;

public class ProductTest {
	private  static AnnotationConfigApplicationContext context;	
	private static ProductDao productDao;
	private static Product product;
	 
	@BeforeClass
	public static void setUp() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		productDao=(ProductDao)context.getBean("productDao");
		product=(Product)context.getBean("product");
		}
	@Test
	public void addProductTest() {
		product.setPid(100);
		product.setPname("toys");
		product.setBrandname("hotfire");
		product.setPrice(0f);
		//product.setCategory();
		product.setStock(10);
		assertEquals("insert Successfully",true,productDao.insertProduct(product));
		}

}
