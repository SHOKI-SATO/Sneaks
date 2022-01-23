package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartContentController {
	@GetMapping("/S_CART")
	public String showCart() {
		return "cart/S_CART";
	}

}
