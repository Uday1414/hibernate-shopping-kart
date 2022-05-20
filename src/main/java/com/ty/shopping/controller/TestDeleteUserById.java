package com.ty.shopping.controller;

import com.ty.shopping.service.UserService;

public class TestDeleteUserById {
	public static void main(String[] args) {
		UserService userService = new UserService();
		boolean flag=userService.deleteUserById(2);
		if(flag) {
			System.out.println("Deleted");
		}else {
			System.out.println("No user with given id");
		}
	}
}
