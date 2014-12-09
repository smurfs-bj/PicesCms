package com.smurfs.bj.picescms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smurfs.bj.picescms.dao.UserMapper;
import com.smurfs.bj.picescms.model.User;
import com.smurfs.bj.picescms.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<User> getAll() {
		return userMapper.getAll();
	}

	public List<User> getAll2() {
		return userMapper.getAll2();
	}

	public List<User> getAll3() {
		return userMapper.getAll3();
	}

}
