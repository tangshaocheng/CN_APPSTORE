package com.dao;

import java.io.Serializable;

import com.model.TUserAppInfo;

public interface UserDaoI {
	public Serializable save(TUserAppInfo u);
}
