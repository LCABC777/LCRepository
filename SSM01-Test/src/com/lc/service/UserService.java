package com.lc.service;

import java.util.List;

import com.lc.pojo.User;

public interface UserService {
	User checkLoginService(String uanme,String pwd);

	int changepwd(int uid, String newpwd);

	List<User> showUser();
}
