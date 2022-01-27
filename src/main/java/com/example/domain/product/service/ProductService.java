package com.example.domain.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.product.model.Product;

@Service
public interface ProductService {
	
	/** 商品一覧を取得 */
	public List<Product> getTopProducts();
	
}
