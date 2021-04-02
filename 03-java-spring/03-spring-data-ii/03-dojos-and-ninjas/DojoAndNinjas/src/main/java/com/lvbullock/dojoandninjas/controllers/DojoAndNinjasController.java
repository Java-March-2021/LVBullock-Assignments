package com.lvbullock.dojoandninjas.controllers;

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

import com.lvbullock.dojoandninjas.models.Dojo;
import com.lvbullock.dojoandninjas.models.Ninja;
import com.lvbullock.dojoandninjas.services.DojoService;
import com.lvbullock.dojoandninjas.services.NinjaService;

@Controller
public class DojoAndNinjasController {
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	//Create a Dojo
	@GetMapping("/")
	public String addDojoPage(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		
		if (result.hasErrors()) {
            return "index.jsp";
        }
		
		else {
			this.dojoService.createDojo(dojo);
			System.out.println(dojo.getName() + " dojo added.");
		}
		return "redirect:/ninjas/new";
	}

	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninjas") Ninja ninja, Model viewModel, BindingResult result) {
		List<Dojo> allDojos = dojoService.getAll();
		viewModel.addAttribute("allDojos", allDojos);
		return "addNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String addNinja(@Valid @ModelAttribute("ninjas") Ninja ninja, @ModelAttribute("dojo") Dojo dojo) {
		this.ninjaService.createNinja(ninja);
		System.out.println(ninja.getFirstName() + " " + ninja.getLastName() + " " + "added to " + dojo.getName() + " dojo.");
		return "redirect:/dojoDetails/" + dojo.getId(); /// is this correct -- should show  ???
	}
	
	
	@GetMapping("/dojoDetails/{id}")
    public String showDojos(@PathVariable("id") Long id, Model viewModel) {
        Dojo dojo = dojoService.getById(id);
        List<Ninja> ninja = dojo.getNinjas();
        viewModel.addAttribute("dojo", dojo);
        viewModel.addAttribute("ninjas", ninja);
        return "/details.jsp";
	}
}
