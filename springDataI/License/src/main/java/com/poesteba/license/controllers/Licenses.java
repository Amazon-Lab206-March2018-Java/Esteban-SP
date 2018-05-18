package com.poesteba.license.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poesteba.license.models.License;
import com.poesteba.license.models.Person;
import com.poesteba.license.services.LicenseService;
import com.poesteba.license.services.PersonService;

@Controller
public class Licenses { 

	private final LicenseService lS;
	private final PersonService pS;
	public Licenses(LicenseService lS,PersonService pS) {
		this.lS = lS;
		this.pS = pS;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		
		return "newPerson";
	}
	@PostMapping("/persons/new")
	public String addPerson(@Valid @ModelAttribute("person") Person person,Model m,BindingResult res) {
		if(res.hasErrors()) {
			return "newPerson";
		}else {
			pS.addPerson(person);
			return "newPerson";
		}
	}
	@RequestMapping("/persons/{id}")
	public String showPerson(Model m, @PathVariable("id") Long id) {
		m.addAttribute("person",pS.findPerson(id));
		m.addAttribute("license", lS.findLicenseByPersonId(id));
		return "person";
	}
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model m) {
		m.addAttribute("expiration", String.format("%06d", lS.allLicenses().size()+1));
		m.addAttribute("persons",pS.allPersons());
		return "newLicense";
	}
	@PostMapping("/licenses/new")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult res) {
		if(res.hasErrors()) {
			return "newLicense";
		}else {
			lS.addLicense(license);
			return "redirect:/persons/new";
		}
	}
}
