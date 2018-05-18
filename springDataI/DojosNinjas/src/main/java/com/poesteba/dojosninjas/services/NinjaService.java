package com.poesteba.dojosninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poesteba.dojosninjas.models.Ninja;
import com.poesteba.dojosninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	private NinjaRepo nR;
	public NinjaService(NinjaRepo nR) {
		this.nR = nR;
	}
	
	public void addNinja(Ninja ninja) {
		nR.save(ninja);
	}
	
	public List<Ninja> dojoNinjas(Long id){
		return nR.findAllByDojo_id(id);
	}
}
