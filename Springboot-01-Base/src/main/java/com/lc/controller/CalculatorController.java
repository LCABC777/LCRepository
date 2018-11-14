package com.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
	@RequestMapping("jisuan")
	public String jisuan(){
		return "script";
	}
}
