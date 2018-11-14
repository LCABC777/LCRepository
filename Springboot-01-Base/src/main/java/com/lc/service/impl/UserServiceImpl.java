package com.lc.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.lc.mapper.UserMapper;
import com.lc.pojo.User;
import com.lc.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	@Pointcut("execution(* com.lc.service.impl.UserServiceImpl.*(..)")
	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		return userMapper.selAll();
	}
	@Override
	public void insertUser(String name, String pwd) {
		// TODO Auto-generated method stub
		userMapper.insUser(name,pwd);
	}
	public void insertHobby(String hobby) {
		// TODO Auto-generated method stub
		userMapper.insHobby(hobby);
		
	}
	
}
