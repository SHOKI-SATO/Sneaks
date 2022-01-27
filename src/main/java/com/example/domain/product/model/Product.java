package com.example.domain.product.model;

import lombok.Data;

@Data
public class Product {
	private int productId;
	private String productName;
	private String brand;
	private int price;
	private String color;
	private String productImage1;
	private String productImage2;
	private String productImage3;
}
