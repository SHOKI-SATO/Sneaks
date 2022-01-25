package com.example.domain.cart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.cart.model.MCart;

@Service
public interface CartContentService {
	public List<MCart> getCart();

}
