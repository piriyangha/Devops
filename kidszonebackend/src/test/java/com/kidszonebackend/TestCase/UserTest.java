package com.kidszonebackend.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.kidszonebackend.Dao.UserDao;
import com.kidszonebackend.Model.User;


public class UserTest {
	
	private  static AnnotationConfigApplicationContext context;	
	 
	@BeforeClass
	public static void setUp() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		}
	@Test
	public void testInserMethod() {
		System.out.println((User)context.getBean("user"));
	    UserDao	userdao=(UserDao)context.getBean("userDao");
	    User user=(User)context.getBean("user");
		user.setName("priya");
		user.setPassword("ishaan");
		user.setDob("17.07.1991");
		user.setAddress("mamamadurai");
		user.setEmail("t.piriyangha@gmail.com");
		user.setPhone("12345678");
		assertEquals("insert Successfully",true,userdao.insertValues(user));
		}
	@AfterClass
	public static void tearDrop() {
		context.close();
	}
}
