package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class TestValidateUserById {
	public static void main(String[] args) {
		UserService userService = new UserService();
		User user=userService.validateUser("uday@mail.com","uday@1414");
		if(user!=null) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getPhone());
		}else {
			System.out.println("No User With Given Data");
		}
	}
}
