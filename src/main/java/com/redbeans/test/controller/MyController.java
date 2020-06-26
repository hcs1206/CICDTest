package com.redbeans.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/hello")	
	public String hello(Model model) {
	   model.addAttribute("msg", "<font color=red>SSAFY님 부자되세요~!!</font>");
	   return "hello";	
	}
}

