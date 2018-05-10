package com.poesteba.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return ("home.html");
	}
	@RequestMapping("/me")
	public String me() {
		return ("profile.html");
	}
	@RequestMapping("/projects")
	public String index() {
		return ("projects.html");
	}
}
