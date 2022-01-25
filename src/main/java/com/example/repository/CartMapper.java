package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.cart.model.MCart;

@Mapper
public interface CartMapper {
	
	/** カート情報取得 */
	public List<MCart>findCart();

}
