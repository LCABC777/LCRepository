package com.lc.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.pojo.Article;
import com.lc.service.impl.DynamicServiceImpl;

@Controller
public class DynamicController {
	@Resource
	private DynamicServiceImpl dynamicServiceImpl;
	@RequestMapping("/dynamic")
	public String dynamicInfo(String author,String name){
		List<Article> la=dynamicServiceImpl.showInfo(author,name);
		System.out.println(la);
		return "redirect:success.jsp";
	}
	
}
