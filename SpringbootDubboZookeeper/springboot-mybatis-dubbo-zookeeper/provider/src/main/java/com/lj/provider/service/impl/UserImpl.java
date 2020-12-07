package com.lj.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import lj.common.domain.User;
import lj.common.service.UserService;

@Service(version = "1.0.0")
public class UserImpl implements UserService {

	public User findUser() {
		User user = new User();
		user.setId(333);
		user.setAge(111);
		user.setName("lisi");
		user.setSex("nv");
		return user;
	}

}
