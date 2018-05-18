package com.poesteba.license.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.poesteba.license.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	ArrayList<Person> findAll();
}
