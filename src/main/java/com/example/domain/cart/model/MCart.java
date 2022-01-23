package com.example.domain.cart.model;

import lombok.Data;

@Data
public class MCart {
	private String userId; 
	private String productId;
	private String productName;
	private String productValue;
	private String productImage1;
	private String productImage2;
	private String productImage3;
}
