package com.poesteba.controllerspractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	@RequestMapping("/bla")
	public String bla() {
		return "index.html";
	}
}
