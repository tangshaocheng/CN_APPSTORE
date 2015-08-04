package com.dao.impl;

import java.io.Serializable;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.UserDaoI;
import com.model.TUserAppInfo;

@Repository("userDao")
public class UserDaoImp implements UserDaoI {
	@Autowired
	private SessionFactory sessionFactory;

	public Serializable save(TUserAppInfo u) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().save(u);
	}


}
