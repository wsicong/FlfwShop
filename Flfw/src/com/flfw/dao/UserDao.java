package com.flfw.dao;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.flfw.domain.User;

public class UserDao {
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(){
		System.out.println("userDao...");
		
		User user =new User();
		user.setUsername("小白");
		user.setPassword("12345");
		
		hibernateTemplate.save(user);
	}
}