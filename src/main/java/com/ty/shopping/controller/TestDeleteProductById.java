package com.ty.shopping.controller;

import com.ty.shopping.service.ProductService;

public class TestDeleteProductById {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		boolean flag=productService.deleteProductById(3);
		if(flag) {
			System.out.println("Deleted");
		}else {
			System.out.println("No product with given Id");
		}
	}
}
