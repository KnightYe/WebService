package com.zhu.service;

import org.springframework.web.bind.annotation.Mapping;

import com.zhu.bean.User;

public interface IUserService {
	
	public  User getUserById(String id);

	public void addUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);
}
