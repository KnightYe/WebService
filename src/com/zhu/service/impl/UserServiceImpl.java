package com.zhu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhu.bean.User;
import com.zhu.mapper.IUserMapper;
import com.zhu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	IUserMapper userMapper;
	
	@Override
	public User getUserById(String id) {
		return userMapper.select(id);
	}

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public void deleteUser(User user) {
		userMapper.delete(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.update(user);
	}

}
