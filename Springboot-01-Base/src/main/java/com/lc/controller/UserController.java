package com.lc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.pojo.User;
import com.lc.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userServiceImpl; 
	@RequestMapping("/user")
	public String user(Model m,@RequestParam(defaultValue="0") String name,@RequestParam(defaultValue="0")String pwd){
	List<User> lu=userServiceImpl.findUser();
	userServiceImpl.insertUser(name,pwd);
	m.addAttribute("lu",lu);
	return "user";
}
}
