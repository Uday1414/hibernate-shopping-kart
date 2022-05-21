package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class TestGetProductById {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=productService.getProductById(5);
		if(product!=null) {
			System.out.println(product);
		}else {
			System.out.println("No product with given id");
		}
	}
}
