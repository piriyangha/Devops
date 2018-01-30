package com.kidszonebackend.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kidszonebackend.Dao.SupplierDao;

import com.kidszonebackend.Model.Supplier;


public class SupplierTest {
	private  static AnnotationConfigApplicationContext context;	
	 
	@BeforeClass
	public static void setUp() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		}
	@Test
	public void addSupplierTest() {
		SupplierDao	supplierDao=(SupplierDao)context.getBean("supplierDao");
		Supplier supplier=(Supplier)context.getBean("supplier");
		
		supplier.setSid(23);
		supplier.setSname("priya");
		assertEquals("insert Successfully",true,supplierDao.insertSupplier(supplier));
		}
	@Test
	public void DeleteSupplierTest() {
		SupplierDao	supplierDao=(SupplierDao)context.getBean("supplierDao");
		Supplier supplier=(Supplier)context.getBean("supplier");
		supplier.setSid(11);
		assertEquals("deleted Successfully",true,supplierDao.deleteSupplier(supplier));
		}
	@Test
	public void updateSupplierTest() {
		SupplierDao	supplierDao=(SupplierDao)context.getBean("supplierDao");
		Supplier supplier=(Supplier)context.getBean("supplier");
		supplier.setSid(22);
		supplier.setSname("priya");
		assertEquals("deleted Successfully",true,supplierDao.updateSupplier(supplier));
		}

}
