package com.poesteba.license.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poesteba.license.models.License;
import com.poesteba.license.repositories.LicenseRepository;
                                                                                                                             
@Service
public class LicenseService {

	private final LicenseRepository lR;
	
	public LicenseService(LicenseRepository lR) {
		this.lR = lR;
	}
	
	public void addLicense(License license) {
		lR.save(license);
	}
	
	public ArrayList<License> allLicenses(){
		return lR.findAll();
	}
	
	public License findLicenseByPersonId(Long id) {
		Optional <License> optLicense = lR.findByPerson_id(id);
		return optLicense.get();
	};
}
