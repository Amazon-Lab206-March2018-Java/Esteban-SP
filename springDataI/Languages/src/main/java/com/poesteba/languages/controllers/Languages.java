package com.poesteba.languages.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poesteba.languages.models.Language;
import com.poesteba.languages.services.LanguageService;

@Controller
public class Languages {
	
	private final LanguageService lS;	
    public Languages(LanguageService lS){
        this.lS = lS;
    }
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/languages";
	}
	@RequestMapping("/languages")
	public String languages(Model m, @ModelAttribute("language") Language language) {
		ArrayList<Language> languages = lS.allLanguages();
		m.addAttribute("languages", languages);
		return "languages";
	}
	@PostMapping("/languages")
    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model m) {
		ArrayList<Language> languages = lS.allLanguages();
		m.addAttribute("languages", languages);
        if (result.hasErrors()) {
            return "languages";
        }else{
            // Add the language            
        	lS.addLanguage(language);
            return "redirect:/languages";
        }
    }
	@RequestMapping("/languages/{id}")
	public String showLanguage(@PathVariable("id") Long id,Model m) {
		Language language = lS.findLanguageById(id);
		m.addAttribute("language", language);
		return "showLanguage";
	}
	@RequestMapping("/languages/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language lang,Model m) {
		Language language = lS.findLanguageById(id);
		m.addAttribute("language", language);
		return "editLanguage";
	}
	@PostMapping("/languages/edit/{id}")
    public String updateLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language lang, BindingResult result,Model m) {
        if (result.hasErrors()) {
        	Language language = lS.findLanguageById(id);
    		m.addAttribute("language", language);
            return "editLanguage";
        }else{
        	lS.updateLanguage(lang);
            return "redirect:/languages";
        }
    }
	@RequestMapping("/languages/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		lS.destroyLanguage(id);
		return "redirect:/languages";
	}
}