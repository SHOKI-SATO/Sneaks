package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.cart.model.MCart;
import com.example.domain.cart.service.CartContentService;

@Controller
public class CartContentController {
	@GetMapping("/S_CART")
	public String showCart() {
		List<MCart> cartList = CartContentService.getCart();

		Model.addAttribute("cart", cartList);
		Model.addAttribute("cart", cartList);

		return "cart/S_CART";
	}

}
