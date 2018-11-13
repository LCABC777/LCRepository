package com.lc.service.impl;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.lc.mapper.UserMapper;
import com.lc.pojo.User;
import com.lc.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	Logger logger=Logger.getLogger(UserServiceImpl.class);
	@Resource
	private UserMapper userMapper;
	@Override
	public User checkLoginService(String uname, String pwd) {
		// TODO Auto-generated method stub
		logger.debug(uname+"发起了登录请求");
		User u=userMapper.checkUser(uname, pwd);
		if(u!=null){
			logger.debug("登录成功");
		}
		else{
			logger.debug("登录失败");
		}
		return u;
	}
	@Override
	public int changepwd(int uid, String newpwd) {
		// TODO Auto-generated method stub
		int index=userMapper.updateUser(uid, newpwd);
		logger.debug(uid+"发起了修改密码请求");
		if(index>0){
			logger.debug("修改密码成功");
		}
		else{
			logger.debug("修改密码登录失败");
		}
		return index;
	}
	@Override
	public List<User> showUser() {
		// TODO Auto-generated method stub
		List<User> lu=new ArrayList<User>();
		lu=userMapper.showInfo();
		logger.debug("显示所有用户信息"+lu);
		return lu;
	}

}
