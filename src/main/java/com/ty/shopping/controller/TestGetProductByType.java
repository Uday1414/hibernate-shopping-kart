package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class TestGetProductByType {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		List<Product> products = productService.getProductByType("cloth");
		if (products.size()>0) {
			for (Product product : products) {
				System.out.println(product);
				System.out.println("------------------------------");
			}
		} else {
			System.out.println("No product with given type");
		}
	}
}
