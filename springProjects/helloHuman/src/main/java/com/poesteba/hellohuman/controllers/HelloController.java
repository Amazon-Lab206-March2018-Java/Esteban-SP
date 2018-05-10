package com.poesteba.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", defaultValue="Human" ) String name, @RequestParam(value="last_name", defaultValue="" ) String last_name, Model m){
		m.addAttribute("name", name);
		m.addAttribute("last_name", last_name);
		return "hello.jsp";
	}
}
