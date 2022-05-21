package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class TestSaveProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		
		Product product=new Product();
		product.setName("shirt");
		product.setBrand("Levis");
		product.setPrice(2000);
		product.setType("clothing");
		product.setSize(42);
		product.setRating(4);
		product.setDescription("very good quality");
		
		Product p=productService.saveProduct(product);
		if(p!=null) {
			System.out.println("Inserted");
			System.out.println(p);
		}else {
			System.out.println("Not Inserted");
		}
	}
}
