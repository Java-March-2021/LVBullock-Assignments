package com.lvbullock.dojoandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvbullock.dojoandninjas.models.Dojo;
import com.lvbullock.dojoandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;
	
	public List<Dojo> getAll(){
		return this.dojoRepo.findAll();
	}
	public Dojo createDojo(Dojo newDojo) {
		return this.dojoRepo.save(newDojo);
	}

	public Dojo getById(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	public Dojo updateEntry(Dojo DojoToUpdate) {
		return this.dojoRepo.save(DojoToUpdate);
	}
	public void deleteById(Long id) {
		this.dojoRepo.deleteById(id);
	}
}
