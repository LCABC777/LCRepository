package com.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyControlller {
	@RequestMapping("/Lc777")
	public String main(){
		return "forward:login.jsp";
	}
}
