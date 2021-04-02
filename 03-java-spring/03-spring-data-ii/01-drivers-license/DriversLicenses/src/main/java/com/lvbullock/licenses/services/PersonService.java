package com.lvbullock.licenses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvbullock.licenses.models.Person;
import com.lvbullock.licenses.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepo;
	
	public List<Person> getAll(){
		return this.personRepo.findAll();
	}
	public Person createPerson(Person newPerson) {
		return this.personRepo.save(newPerson);
	}
	public Person createPerson(Person person, String firstName, String lastName) {
		return this.personRepo.save(person);
	}
	public Person getSinglePerson(Long id) {
		return this.personRepo.findById(id).orElse(null);
	}
	public Person updatePerson(Person personToUpdate) {
		return this.personRepo.save(personToUpdate);
	}
	public void deleteById(Long id) {
		this.personRepo.deleteById(id);
	}
}
