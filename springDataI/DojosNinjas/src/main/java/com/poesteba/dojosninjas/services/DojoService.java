package com.poesteba.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poesteba.dojosninjas.models.Dojo;
import com.poesteba.dojosninjas.repositories.DojoRepo;

@Service
public class DojoService {
	
	private final DojoRepo dR;
	public DojoService(DojoRepo dR) {
		this.dR=dR;
	}
	
	public List<Dojo> allDojos(){
		return dR.findAll();
	}
	
	public void addDojo(Dojo dojo) {
		dR.save(dojo);
	}

	public Dojo findDojo(Long id) {
		Optional<Dojo> optDojo = dR.findById(id);
		if (optDojo.isPresent()) {
			return optDojo.get();
		} else {
			return null;			
		}
	}
	
}
