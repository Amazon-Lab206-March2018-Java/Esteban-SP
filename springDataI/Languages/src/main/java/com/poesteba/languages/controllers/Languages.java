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
	
	private final LanguageService languageService;	
    public Languages(LanguageService languageService){
        this.languageService = languageService;
    }
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/languages";
	}
	@RequestMapping("/languages")
	public String languages(Model m, @ModelAttribute("language") Language language) {
		ArrayList<Language> languages = languageService.allLanguages();
		m.addAttribute("languages", languages);
		return "languages";
	}
	@PostMapping("/languages")
    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model m) {
		ArrayList<Language> languages = languageService.allLanguages();
		m.addAttribute("languages", languages);
        if (result.hasErrors()) {
            return "languages";
        }else{
            // Add the language            
        	languageService.addLanguage(language);
            return "redirect:/languages";
        }
    }
	@RequestMapping("/languages/{langID}")
	public String showLanguage(@PathVariable("langID") int langID,Model m) {
		Language language = languageService.findLanguageByIndex(langID);
		m.addAttribute("language", language);
		return "showLanguage";
	}
	@RequestMapping("/languages/edit/{langID}")
	public String editLanguage(@PathVariable("langID") int langID, @Valid @ModelAttribute("language") Language l,Model m) {
		Language language = languageService.findLanguageByIndex(langID);
		m.addAttribute("language", language);
		return "editLanguage";
	}
	@PostMapping("/languages/edit/{id}")
    public String updateLanguage(@PathVariable("langID") int langID, @Valid @ModelAttribute("language") Language l, BindingResult result,Model m) {
        if (result.hasErrors()) {
        	Language language = languageService.findLanguageByIndex(langID);
    		m.addAttribute("language", language);
            return "editLanguage";
        }else{
        	languageService.updateLanguage(langID, l);
            return "redirect:/languages";
        }
    }
	@RequestMapping("/languages/delete/{langID}")
	public String deleteLanguage(@PathVariable("langID") int langID) {
		languageService.destroyLanguage(langID);
		return "redirect:/languages";
	}
}