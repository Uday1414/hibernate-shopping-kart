package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class TestSaveUser {
	public static void main(String[] args) {
		UserService userService=new UserService();
		
		User user=new User();
		user.setName("naresh");
		user.setEmail("naresh@mail.com");
		user.setPassword("naresh@1414");
		user.setPhone("8855664447");
		
		User u=userService.saveUser(user);
		if(u!=null) {
			System.out.println("Inserted");
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getEmail());
			System.out.println(u.getPhone());
		}else {
			System.out.println("Not Inserted");
		}
	}
}
