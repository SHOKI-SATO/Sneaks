package com.example.domain.cart.model;

import lombok.Data;

@Data
public class MCart {
	private String userId; 
	private String productId;
	private int quantity;
}
