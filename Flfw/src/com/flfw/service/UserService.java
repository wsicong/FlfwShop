package com.flfw.service;

import org.springframework.transaction.annotation.Transactional;

import com.flfw.dao.UserDao;

@Transactional
public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(){
		System.out.println("userService...");
		userDao.add();
	}
}
