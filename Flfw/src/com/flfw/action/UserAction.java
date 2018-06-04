package com.flfw.action;

import com.flfw.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute() throws Exception{
		System.out.println("userAction...");
		userService.add();
		return SUCCESS;
	}
}

