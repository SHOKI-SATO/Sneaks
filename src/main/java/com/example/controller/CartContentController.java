package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.cart.model.MCart;
import com.example.domain.cart.service.CartContentService;

@Controller
@RequestMapping("/S_CART")
public class CartContentController {
	
	@Autowired
	private CartContentService cartcontentservice;
	
	@GetMapping("/S_CART")
	public String showCart(Model model) {
		List<MCart> cartList = CartContentService.getCart();

		model.addAttribute("cart", cartList);

		return "cart/S_CART";
	}

}
