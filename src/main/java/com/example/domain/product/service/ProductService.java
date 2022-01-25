package com.example.domain.product.service;
import java.util.List;

import com.example.domain.product.model.Product;

public interface ProductService {
	
	/** 商品一覧 */
	public List<Product> getProducts();

}
