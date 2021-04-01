package com.lvbullock.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lvbullock.languages.models.Language;
import com.lvbullock.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService langService;
	
	//The GET /languages route should show a table of all the languages with links to edit and delete the languages; also include a form for creating new languages.
	//Get All Languages

	@GetMapping("/languages") //localhost:8080 - must enter /languages to the end
	public String index(@ModelAttribute("language") Language language, Model model) {
		List<Language> allLanguages = this.langService.getAllLanguages();
		model.addAttribute("allLanguages", allLanguages);
		return "index.jsp";	
	}
	
	
	//Create A Language
	@GetMapping("/languages/add")  // can not have the same path for the GET POST PUT DELETE method)
	public String addLanguage(@ModelAttribute("language") Language language, Model model) {
		return "index.jsp";
	}
	//The POST /languages routes should create a language.
	@PostMapping("/languages")
	//@Valid annotation checks to see if the submitted object passes validation
	public String addL(@Valid @ModelAttribute("language") Language language, BindingResult result) {

		if(result.hasErrors()) {  //All routes should be validated and show errors.
			return "index.jsp";  //going to WEB-INF file
		}
		this.langService.createLanguage(language);
		System.out.println("New language added.");

		return "redirect:/languages";
	}
	//The GET /languages/{id} route should return the specific language and details.
	//Get One Language (Read)
	@GetMapping("/languages/{id}")
	public String findById(@ModelAttribute("language") Language language, Model model, @PathVariable("id") Long id) {
		Language singleLanguage = this.langService.getSingleLanguage(id);
		model.addAttribute("language", singleLanguage);
		return "displayLanguage.jsp";
	}
	//The GET /languages/{id}/edit route should show the edit page to of a specific language
	//Update A Language
	@GetMapping("/languages/edit/{id}")
	public String updateLanguage(@PathVariable("id") Long id, Model model, @ModelAttribute("lanuage") Language language) {
		model.addAttribute("language", langService.getSingleLanguage(id));
		return "edit.jsp";
	}
	@PostMapping("languages/edit/{id}")
	public String editLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model model) {
		Long languageId = language.getId();
		if(result.hasErrors()) {			//All routes should be validated and show errors.
			return "edit.jsp";
		}
		this.langService.updateLanguage(language);
		System.out.println("Language Successfully Updated!");
		return "redirect:/languages/" + languageId;
	}
	//The DELETE /languages/{id} route should delete the specific language at that id.
	//Delete A Language
	@GetMapping("/languages/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.langService.deleteLanguage(id);
		System.out.println("Language deleted.");
		return "redirect:/languages";
	}
}
