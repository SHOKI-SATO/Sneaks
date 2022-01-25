package com.example.domain.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.product.model.Product;
import com.example.domain.product.service.ProductService;
import com.example.repository.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper mapper;
	
	@Override
	public List<Product> getProducts() {
		return mapper.findAll();
		
	}
	

}
