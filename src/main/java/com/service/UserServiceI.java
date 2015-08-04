package com.service;

import java.io.Serializable;

import com.model.TUserAppInfo;

public interface UserServiceI {
	public Serializable addUser(TUserAppInfo u);

	public TUserAppInfo findByName(String name);

	public void test();

	public void updateUser(TUserAppInfo u);
	
	public void reload();

}
