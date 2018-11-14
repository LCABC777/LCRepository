package com.lc.controller;

import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lc.service.impl.UserServiceImpl;

@Controller
public class CheckBoxController {
	@Resource
	private UserServiceImpl userServiceImpl;
	@RequestMapping("check")
	public String checkBox(){
		return "check";
	}
	@RequestMapping("acheive")
	@ResponseBody
	public void acheive(HttpServletRequest req){
		String[] m=req.getParameterValues("my");
		System.out.println(Arrays.toString(m));
		for(String temp:m){
			userServiceImpl.insertHobby(temp);
		}
	}
}
