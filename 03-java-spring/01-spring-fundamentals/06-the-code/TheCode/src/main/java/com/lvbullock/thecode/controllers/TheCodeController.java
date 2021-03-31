package com.lvbullock.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	//Create a page where a user can submit a code
	@RequestMapping("/")  //index page, page to enter the code
	public String index(@ModelAttribute("errors") String errors, Model viewModel) {
		viewModel.addAttribute("errors", errors);
		return "index.jsp";
	}
	
	//Check the code against the word "bushido".  
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="guess") String guess, RedirectAttributes redirectAttributes) {
		System.out.println(guess);
		//If it's valid, give access to the code route
		if(guess.equals("bushido")) {
			System.out.println("Access Granted!");
			return "code.jsp";
		}
		//otherwise redirect to root and display a flash error message.
		else {
			redirectAttributes.addFlashAttribute("errors", "Access Denied.  You must train harder!");
			System.out.println("Incorrect guess.  Access Denied!");
			return "redirect:/";
		}
	}
}

/*Assignment: The Code - http://learn.codingdojo.com/m/145/6906/49961
Sam Samurai wants you to make a page for him that is only accessible to people who know the code. If they don't know the code, then he wants to tell them to train harder. Those that do know the code should be able to view the code he has provided you in the wireframe below.


Topics:
- Error Messages

Tasks:
- Create a page where a user can submit a code

- Check the code against the word "bushido"

- If it's valid, give access to the code route

- otherwise redirect to root and display a flash error message.*/
