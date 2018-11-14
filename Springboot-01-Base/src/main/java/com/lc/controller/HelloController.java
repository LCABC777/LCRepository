package com.lc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/app/hello")
	@ResponseBody
	public Map<String,String> hello(){
		Map<String,String> m=new HashMap<>();
		m.put("hello", "hello");
		return m;
	}
}
