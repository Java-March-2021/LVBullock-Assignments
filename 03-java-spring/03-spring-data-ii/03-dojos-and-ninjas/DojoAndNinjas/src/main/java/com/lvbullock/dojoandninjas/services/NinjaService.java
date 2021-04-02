package com.lvbullock.dojoandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvbullock.dojoandninjas.models.Ninja;
import com.lvbullock.dojoandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public List<Ninja> getAll(){
		return this.ninjaRepo.findAll();
	}
	
	public Ninja createNinja(Ninja newNinja) {
		return this.ninjaRepo.save(newNinja);
	}
	
	public Ninja getById(Long id) {
		return this.ninjaRepo.findById(id).orElse(null);
	}
	
	public Ninja updateEntry(Ninja ninjaToUpdate) {
		return this.ninjaRepo.save(ninjaToUpdate);
	}
	
	public void deleteById(Long id) {
		this.ninjaRepo.deleteById(id);
	}
}
