package com.lvbullock.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHumanController {
	//Greet whoever visits your page. If they don't tell you their name, then greet them as "human"

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/visitor", method=RequestMethod.POST)
	public String getName(@RequestParam(value="visitorName", required=false, defaultValue="Human") String name, Model viewModel) {
		System.out.println(name);
		viewModel.addAttribute("visitorName", name);
		return "result.jsp";
	}
	
	
	//Path Variable
	
	@RequestMapping(value="/visitor/{favoriteColor}", method=RequestMethod.GET)
	public String favColor(@PathVariable("favoriteColor") String favColor, Model viewModel) {
		System.out.println(favColor);
		viewModel.addAttribute("color", favColor);
		return "favColor.jsp";	
	}
}
