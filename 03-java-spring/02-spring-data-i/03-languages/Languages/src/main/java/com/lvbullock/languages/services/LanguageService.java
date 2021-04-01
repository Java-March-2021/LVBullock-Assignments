package com.lvbullock.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lvbullock.languages.models.Language;
import com.lvbullock.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	//Dependency Injection

	private LanguageRepository languageRepo; //gives us access to the Repository
	
	public LanguageService(LanguageRepository repo) {
		this.languageRepo = repo;
	}
	
	//MAKE CRUD METHODS  CRUD: C = Create  R = Read   U = Update   D = Delete
	
	//Get All Languages
	public List<Language> getAllLanguages(){
		return this.languageRepo.findAll();
	}
	
	//Create A Language
	public Language createLanguage(Language newLanguage) {
		return this.languageRepo.save(newLanguage);
	}
	
	//Get One Language (Read)
	public Language getSingleLanguage(Long id) {
		return this.languageRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}

	//Update A Language
	public Language updateLanguage(Language updatedLanguage) {
		return this.languageRepo.save(updatedLanguage);
	}
	
	//Delete A Language
	public void deleteLanguage(Long id) {  //note:  not public Language here because we are returning a string confirmation
		this.languageRepo.deleteById(id);
	}
}
