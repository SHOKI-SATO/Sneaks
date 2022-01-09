package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/products")
@Slf4j
public class ProductsController {
	
	@GetMapping("/top")
	public String getTop() {
		return "/top/S_TOP";
	}

}
