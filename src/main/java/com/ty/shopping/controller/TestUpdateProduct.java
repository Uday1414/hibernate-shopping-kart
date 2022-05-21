package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class TestUpdateProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		
		Product product=new Product();
		product.setName("shirt");
		product.setBrand("UCB");
		product.setPrice(2099);
		product.setType("clothing");
		product.setSize(42);
		product.setRating(4);
		product.setDescription("very good quality");
		
		productService.updateProductById(3, product);
	}
}
