package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.TUserAppInfo;
import com.service.UserServiceI;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceI userService;

	@RequestMapping(params = "method=add")
	public String add(TUserAppInfo t) {
		userService.addUser(t);
		return "success";
	}

}
