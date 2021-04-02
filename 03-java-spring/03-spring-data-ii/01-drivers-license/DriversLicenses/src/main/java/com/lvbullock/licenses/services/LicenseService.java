package com.lvbullock.licenses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvbullock.licenses.models.License;
import com.lvbullock.licenses.repositories.LicenseRepository;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepository licenseRepo;
	
	public List<License> getAll(){
		return this.licenseRepo.findAll();
	}
	
	public License createLicense(License newLicense) {
		return this.licenseRepo.save(newLicense);
	}
	
	public License getSingleLicense(Long id) {
		return this.licenseRepo.findById(id).orElse(null);
	}
	
	public License updateLicense(License licenseToUpdate) {
		return this.licenseRepo.save(licenseToUpdate);
	}
	
	public void deleteById(Long id) {
		this.licenseRepo.deleteById(id);
	}
}
