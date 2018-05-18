package com.poesteba.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poesteba.dojosninjas.models.Dojo;
import com.poesteba.dojosninjas.models.Ninja;
import com.poesteba.dojosninjas.services.DojoService;
import com.poesteba.dojosninjas.services.NinjaService;

@Controller
public class Controllers {
	
	private final DojoService dS;
	private final NinjaService nS;
	public Controllers(DojoService dS, NinjaService nS) {
		this.dS = dS;
		this.nS = nS;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/dojos/new";
	}
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute Dojo dojo) {
		return "newDojo";
	}
	@PostMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute Dojo dojo, BindingResult res) {
		if (res.hasErrors()) {
			return "newDojo";			
		}else {
			dS.addDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute Ninja ninja, Model m) {
		m.addAttribute("dojos", dS.allDojos());
		return "newNinja";
	}
	@PostMapping("/ninjas/new")
	public String newNinja(@Valid @ModelAttribute Ninja ninja, BindingResult res, Model m) {
		if (res.hasErrors()) {
			m.addAttribute("dojos", dS.allDojos());
			return "newNinja";			
		} else {
			nS.addNinja(ninja);
			return "redirect:/dojos/new";
		}
	}
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model m) {
		Dojo dojo = dS.findDojo(id);
		m.addAttribute("dojo",dojo);
		List<Ninja> ninjas = nS.dojoNinjas(dojo.getId());
		m.addAttribute("ninjas", ninjas);
		System.out.println(ninjas);
		return "showDojo";
	}
	
}
