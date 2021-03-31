package com.lvbullock.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/result", method=RequestMethod.POST)
	public String form(@RequestParam(value="userName") String userName, @RequestParam(value="email") String email, @RequestParam(value="dojoLocation") String dojoLocation, @RequestParam(value="selectLanguage") String selectLanguage, @RequestParam(value="comment") String comment, Model viewModel) {
		viewModel.addAttribute("userName", userName);
		System.out.println(userName);
		
		viewModel.addAttribute("email", email);
		System.out.println(email);
		
		viewModel.addAttribute("dojoLocation", dojoLocation);
		System.out.println(dojoLocation);
		
		viewModel.addAttribute("selectLanguage", selectLanguage);
		System.out.println(selectLanguage);
		
		viewModel.addAttribute("comment", comment);
		System.out.println(comment);
		
		return "result.jsp";	
	}
}
/*Assignment: Dojo Survey - http://learn.codingdojo.com/m/145/6906/49956
You need to build a form to submit post information to your server, and then render that information on a results page so you can survey your friends on their favorite languages!

Topics:
- POST

Tasks:
- Create a 2 page app that will allow clients to fill out a form and see the form results.

Optional Challenges:
- Can you render a third page for anyone that chooses "java" as their favorite language?*/
