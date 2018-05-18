package com.poesteba.license.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poesteba.license.models.Person;
import com.poesteba.license.repositories.PersonRepository;

@Service
public class PersonService {
	
	private final PersonRepository pR;
	
	public PersonService(PersonRepository pR) {
		this.pR = pR;
	}
	
	public ArrayList<Person> allPersons(){
		return pR.findAll();
	}
	
	public void addPerson(Person person) {
		pR.save(person);
	}
	
	public Person findPerson(Long id) {
		Optional<Person> person = pR.findById(id);
		if(person.isPresent()) {
			return person.get();
		}else {
			return null;
		}
	}
}
