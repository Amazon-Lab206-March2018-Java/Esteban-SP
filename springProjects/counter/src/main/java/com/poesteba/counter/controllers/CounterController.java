package com.poesteba.counter.controllers;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession sesh) {
		if (sesh.getAttribute("count") == null) {
			sesh.setAttribute("count", new Integer(1));
		}else {
			Integer count = (Integer) sesh.getAttribute("count");
			count++;
			sesh.setAttribute("count", count);
		}
		return "home.jsp";
	}
	@RequestMapping("/counter")
	public String showCounter(HttpSession sesh) {
		if (sesh.getAttribute("count") == null) {
			sesh.setAttribute("count", new Integer(0));
		}
		return "counter.jsp";
	}
	@RequestMapping("/plus")
	public String extraCounter(HttpSession sesh, HttpServletResponse response) {
		if (sesh.getAttribute("count") == null) {
			sesh.setAttribute("count", new Integer(0));
		}else {
			Integer count = (Integer) sesh.getAttribute("count");
			count++;
			sesh.setAttribute("count", count);
		}
		return "redirect:/";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession sesh) {
		if (sesh.getAttribute("count") != null) {
			sesh.setAttribute("count", null);
		}
		return "redirect:/";		
	}
}
