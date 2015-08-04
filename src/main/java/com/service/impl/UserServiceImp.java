package com.service.impl;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dao.UserDaoI;
import com.model.TUserAppInfo;
import com.service.UserServiceI;

@Service("userService")
public class UserServiceImp implements UserServiceI {
	@Autowired
	private UserDaoI userDao;

	private static final Logger logger = Logger.getLogger(UserServiceImp.class);

	public void test() {
		// TODO Auto-generated method stub
		logger.info("success!!");
	}

	public Serializable addUser(TUserAppInfo u) {
		// TODO Auto-generated method stub
		return userDao.save(u);
	}

	@Override
	@Cacheable(value = "UserCache")
	public TUserAppInfo findByName(String name) {
		// TODO Auto-generated method stub
		logger.info("real querying user... {}" + name);
		TUserAppInfo user = getFromDB(name);
		if (user == null) {
			throw new IllegalStateException(String.format(
					"can not find account by account name : [%s]", name));
		}

		return user;
	}

	private TUserAppInfo getFromDB(String name) {
		logger.info("real querying db... {}" + name);
		return new TUserAppInfo(name, name, name, null, name);
	}

	@Override
	@CacheEvict(value = "UserCache", key = "#u.getAppName()")
	public void updateUser(TUserAppInfo u) {
		// TODO Auto-generated method stub
		updateDB(u);
	}

	private void updateDB(TUserAppInfo u) {
		logger.info("real update db...{}" + u.getAppName());
	}

	@Override
	@CacheEvict(value = "UserCache", allEntries = true)
	public void reload() {
		// TODO Auto-generated method stub
	}

}
