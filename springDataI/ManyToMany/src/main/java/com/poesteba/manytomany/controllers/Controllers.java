package com.poesteba.manytomany.controllers;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class Controllers {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

