package com.poesteba.languages.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.poesteba.languages.models.Language;

@Service
public class LanguageService {
	private ArrayList<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("Java", "James Gosling", "1.8"),
			new Language("Python", "Guido van Rossum", "3.6"),
			new Language("HTML", "Tim Berners-Lee", "5.1")
			));
	public ArrayList<Language> allLanguages() {
	     return languages;
	 }
	public Language findLanguageByIndex(int index) {
	    if (index < languages.size()){
	        return languages.get(index);
	    }else{
	        return null;
	    }
	}
	public void addLanguage(Language language) {
		languages.add(language);
	}
	public void updateLanguage(int id, Language language) {
	       if (id < languages.size()){
	    	   languages.set(id, language);
	       }
	   }
	public void destroyLanguage(int id) {
	    if (id < languages.size()){
	    	languages.remove(id);
	    }
	}
}
