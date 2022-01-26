package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.cart.model.MCart;
import com.example.repository.CartMapper;

@Controller
@RequestMapping("/cart")
public class CartContentController {
	
	private CartMapper mapper;
	
	@RequestMapping(value="/{userId}",method=RequestMethod.GET)
	public String showCart(ModelMap model, @PathVariable("userId") String userId) {
		
		//cart情報獲得
		List<MCart> cart = mapper.findCart(userId);
		
		
		
		return "cart/S_CART";
	}

}
