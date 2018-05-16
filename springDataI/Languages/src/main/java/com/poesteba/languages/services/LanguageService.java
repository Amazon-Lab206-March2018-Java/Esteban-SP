package com.poesteba.languages.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poesteba.languages.models.Language;
import com.poesteba.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lR;
    public LanguageService(LanguageRepository lR){
        this.lR = lR;
    }
	public ArrayList<Language> allLanguages() {
	     return lR.findAll();
	 }
	public void addLanguage(Language language) {
		lR.save(language);
	}
	public Language findLanguageById(Long id) {
		Optional<Language> optionalLanguage = lR.findById(id);
		if (optionalLanguage.isPresent()){
			return optionalLanguage.get();
		}else{
			return null;
		}
	}
	public void updateLanguage(Language language) {
		lR.save(language);
	   }
	public void destroyLanguage(Long id) {
		Optional<Language> optionalLanguage = lR.findById(id);
		if (optionalLanguage.isPresent()){
	    	 lR.deleteById(id);
	    }
	}
}
