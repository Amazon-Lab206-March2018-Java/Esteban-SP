package com.poesteba.license.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.poesteba.license.models.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

	ArrayList<License> findAll();
	
	Optional<License> findByPerson_id(Long id);
}
