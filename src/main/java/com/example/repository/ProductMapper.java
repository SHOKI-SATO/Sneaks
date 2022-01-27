package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.product.model.Product;

@Mapper
public interface ProductMapper {
	
	/* 商品一覧獲得 */
	public List<Product> findManyProducts();
}
