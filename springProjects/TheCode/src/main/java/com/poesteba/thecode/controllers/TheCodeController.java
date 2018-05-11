package com.poesteba.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/check_code", method=RequestMethod.POST)
	public String check(@RequestParam("codeGuess") String codeGuess, RedirectAttributes redirectAttributes) {
		if (codeGuess.equals("bushido")) {
			return "redirect:/code";			
		}
        redirectAttributes.addFlashAttribute("errors", "You must train harder!");
		return "redirect:/";
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
