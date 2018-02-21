package com.kidszone.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kidszonebackend.Dao.CartDao;
import com.kidszonebackend.Dao.CartItemDao;
import com.kidszonebackend.Dao.ProductDao;
import com.kidszonebackend.Dao.UserDao;
import com.kidszonebackend.Model.Cart;
import com.kidszonebackend.Model.CartItem;
import com.kidszonebackend.Model.Product;
import com.kidszonebackend.Model.User;

@Controller
@Transactional
public class CartController {
	@Autowired
	ProductDao productdao;
	@Autowired
	UserDao userdao;
	@Autowired
	CartDao cartDao;
	@Autowired
	CartItemDao cartitemdao;
	@Autowired
	User user;
	
	
	@RequestMapping("/user/cart")
	public String addToCart(Model model, Principal principal) {	
		List<Cart> list=cartDao.getCartByUser(principal.getName());
	    model.addAttribute("cartlist",list);
		return "Cart";
	}
	
	@RequestMapping(value={"/user/addToCart/{pid}"})
	public String addToCart(@PathVariable int pid, Principal principal, Model model)
	{
		User user = userdao.getUserByUsername(principal.getName());//fetching user details
		System.out.println(user.getName());
		Product product = productdao.getProductById(pid);//fectching  user clicking product object based on id 
		System.out.println(product.getPname());
		CartItem cartItem = new CartItem(); //created  object for cartitem
		Cart cart = new Cart();//created  object for cart
		List<CartItem> cartItems;//created  object for list of cartitem
		
		if (user.getCart() == null)//checks user already has cart.if user doesnt have cart then go to if statement
		{
			cart.setUser(user);//creating user for cart
			user.setCart(cart);//creating cart for user
			cartDao.saveOrUpdateCart(cart);//save or update the cart
			userdao.insertValues(user);//save or update the user
		}
		else {
			
			cart= user.getCart();//if the user already has cart means getting the cart under cart object
		}
		if((cartItem = cartitemdao.getCartItemById(pid,cart.getCartid()))!=null)//checking cartitem alreday exits in cart using card id and product id
         {
			System.out.println("-----No cartitem found in cart-----");
			cartItem.setSubquantity(cartItem.getSubquantity() + 1);//if the item already exist and the user again select that item means it adds the quantity
			
			cartItem.setSubtotal(cartItem.getSubquantity() * cartItem.getProduct().getPrice());//according to the quantity the price of product gets multiplies
			cartItem.setCart(cart);//setting the cart
            cartItems = cart.getCartItems();
			
			for(CartItem c:cartItems) {
				if(c.getProduct().getPid() == cartItem.getProduct().getPid())//comparing current product with the existing cartitem
																			 //if that product already present just increment the quantity
				{
					c.setSubquantity(cartItem.getSubquantity());
					c.setSubtotal(cartItem.getSubtotal());
				}
					
         }
         }
		else{
			System.out.println("-----cartitem found in cart-----");
			
			cartItem=new CartItem();// if the cart item was empty
			cartItem.setProduct(product);//set the selected cartitem in cart
			cartItem.setSubquantity(1);//make the quantity as 1.
			cartItem.setSubtotal(cartItem.getSubquantity() * cartItem.getProduct().getPrice());
			cartItem.setCart(cart);
			cartItems = cart.getCartItems();//cart items already present
				if(cartItems == null){
					cartItems = new ArrayList<CartItem>();
				}
			
			cartItems.add(cartItem);//cart item values are set
			
		}

		cart.setCartItems(cartItems);
		double grandtotal = 0;
		int count = 0;
		for (CartItem ci : cartItems) 
		{
			grandtotal = grandtotal + ci.getSubtotal();
			count++;
		}

		cart.setGrandTotal(grandtotal);
		cart.setQty(count);
		cartDao.saveOrUpdateCart(cart);
		model.addAttribute("cart", cart);
        return "Cart";
	}
	@RequestMapping("/cart/removecartitem/{cartId}")
	public String deleteCart(@PathVariable int cartId) {	
		cartDao.deleteCart(cartId);
		return "redirect:/user/cart";
	}
	}
