package com.poesteba.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeControllers {
	@RequestMapping("/")
	public String home(){
		return "home.jsp";
	}
	@RequestMapping("/date")
	public String date(Model m){
		Date date = new Date();
		m.addAttribute("date",date);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model m){
		Date time = new Date();
		m.addAttribute("time",time);
		return "time.jsp";
	}
}
