package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.product.model.Product;
import com.example.domain.product.service.ProductService;
import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/products")
@Slf4j
public class ProductsController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/top")
	public String getTop(ModelMap model) {
		//ログインしているユーザー情報の獲得
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		//取得したユーザー情報から、ユーザーIDを取得する
		String id = auth.getName();
		
		//ユーザーIDからユーザーを獲得
		MUser user = userService.getUserOne(id);
		String name = user.getUserName();
		
		//modelにユーザー名とIDを格納する
		model.addAttribute("userId", id);
		model.addAttribute("userName", name);
		
		//商品一覧を取得
		List<Product> products = productService.getTopProducts();
		
		//modelに商品一覧を格納
		model.addAttribute("productsList", products);
		
		return "/top/S_TOP";
	}

}
