package com.smurfs.bj.picescms.service;

import java.util.List;

import com.smurfs.bj.picescms.model.User;

public interface UserService {

	public User getUserById(String id);

	public List<User> getAll();

	public List<User> getAll2();

	public List<User> getAll3();

}
