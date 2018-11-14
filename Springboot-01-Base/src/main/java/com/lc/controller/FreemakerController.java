package com.lc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.pojo.User;

@Controller
public class FreemakerController {
	@RequestMapping("freemaker")
	public String freemaker(HttpServletRequest req){
		List<User> lu=new ArrayList<>();
		lu.add(0, new User("1","1"));
		lu.add(1, new User("2","2"));
		lu.add(2, new User("3","3"));
		req.setAttribute("lu", lu);
		return "freemaker";
//		freemaker不用配置自定义视图解析器，一样可以省略前后缀
	}
}
