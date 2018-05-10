package com.poesteba.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(path="/result",method=RequestMethod.POST)
	public String process(Model m, @RequestParam(value="name") String name, @RequestParam(value="location") String location,@RequestParam(value="language") String language,@RequestParam(value="comments",required=false) String comments) {
		m.addAttribute("name", name);		
		m.addAttribute("location", location);
		m.addAttribute("language", language);
		m.addAttribute("comments", comments);
		if(m.asMap().get("language").equals("Java")) {
			return "java.jsp";
		}
		return "result.jsp";
	}
}
