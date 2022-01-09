package com.example.demo;

import java.io.Serializable;

import javax.validation.constraints.Min;

import com.sun.istack.NotNull;

public class ProductAddForm implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @NotNull
    private String ProductsId;

    @NotNull
    @Min(1)
    private int quantity;

    public String getProductsId() {
        return ProductsId;
    }

    public void setProductsId(String ProductsId) {
        this.ProductsId = ProductsId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}