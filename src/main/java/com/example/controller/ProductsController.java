package com.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/products")
@Slf4j
public class ProductsController {
	
	@GetMapping("/top")
	public String getTop(ModelMap model) {
		//ログインしているユーザー情報の獲得
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		
		model.addAttribute("username", name);
		return "/top/S_TOP";
	}

}
