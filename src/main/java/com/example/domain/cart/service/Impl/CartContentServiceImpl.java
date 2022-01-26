package com.example.domain.cart.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.cart.model.MCart;
import com.example.domain.cart.service.CartContentService;
import com.example.repository.CartMapper;

@Service
public class CartContentServiceImpl implements CartContentService{
	
	@Autowired
	private CartMapper mapper;
	
	public List<MCart>getCart(){
		return mapper.findCart();
	}
	

}
