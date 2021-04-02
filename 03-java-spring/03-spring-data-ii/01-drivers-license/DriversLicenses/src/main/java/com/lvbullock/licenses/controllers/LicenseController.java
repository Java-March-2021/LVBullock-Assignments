package com.lvbullock.licenses.controllers;

import java.util.Date;
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

import com.lvbullock.licenses.models.License;
import com.lvbullock.licenses.models.Person;
import com.lvbullock.licenses.services.LicenseService;
import com.lvbullock.licenses.services.PersonService;

@Controller
public class LicenseController {
	@Autowired
	private PersonService personService;
	@Autowired
	private LicenseService licenseService;
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	//Create a Person
	@GetMapping("/person/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/person/new")
    public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
            return "newPerson.jsp";
        }
		
		else {
        this.personService.createPerson(person);
        System.out.println(person.getFirstName() + " " + person.getLastName() + " has been added!");
//        return "redirect:/person/new";
		}
        return "redirect:/license/new";
	}
	
	//Create a License
	@GetMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license, Model viewModel) {
		List<Person> everyPerson = personService.getAll();
		viewModel.addAttribute("everyPerson", everyPerson);
		return "newLicense.jsp";
	}
	
	@PostMapping("/license/add")
	public String createLicense(@Valid @ModelAttribute("license")License license, BindingResult result) {
		if (result.hasErrors()) {
            return "newLicense.jsp"; //
        }
		else {
		License newLicense = this.licenseService.createLicense(license);
		Long newLicensePersonId = newLicense.getPerson().getId();//get the person's id
//		this.licenseService.createLicense(license);
        System.out.println("Customer's license number has been generated.");
		return "redirect:/license/details/" + newLicensePersonId;
		}
	}
	
	//Get One License (Read)
	@GetMapping("/license/details/{id}")
	public String details(@PathVariable("id") Long id, Model viewModel) {
		License license = licenseService.getSingleLicense(id);
		
		if( license != null) {			
			Date expireDate = license.getExpirationDate();
			viewModel.addAttribute("person", this.personService.getSinglePerson(id));
			viewModel.addAttribute("license", license);
			viewModel.addAttribute("expDate", expireDate);
			return "details.jsp";
		}
		
			viewModel.addAttribute("person", this.personService.getSinglePerson(id));
			return "details.jsp";
	}
}
