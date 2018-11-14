package com.lc.service;

import java.util.List;

import com.lc.pojo.User;

public interface UserService {
	List<User> findUser();

	void insertUser(String name, String pwd);
	
	void insertHobby(String hobby);
}
