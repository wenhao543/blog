package com.wenhao.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenhao.test.form.User;

@RestController
public class TestController {
	
	@RequestMapping("/showuser")
	public User showUser() {
		User user = new User();
		user.setName("wll");
		user.setAddress("重庆万州");
		return user;
	}

}
