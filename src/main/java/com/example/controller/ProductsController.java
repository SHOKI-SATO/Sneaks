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
	private ProductService productService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/top")
	public String getTop(ModelMap model) {
		//ログインしているユーザー情報の獲得
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String userId = auth.getName();
		
		//IDからユーザーを取得
		MUser user = userService.getUserOne(userId);
		
		//ユーザー名のみ取得
		String name = user.getUserName();
		
		//modelにユーザー名を追加
		model.addAttribute("username", name);
		
		//Topに表示する商品一覧を取得
		List<Product> product = productService.getProducts();
		
		//モデルに商品一覧を追加
		model.addAttribute("products", product);
		
		return "/top/S_TOP";
	}

}
