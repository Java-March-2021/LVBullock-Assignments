package com.lvbullock.registerlogin.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lvbullock.registerlogin.models.User;
import com.lvbullock.registerlogin.services.UserService;
import com.lvbullock.registerlogin.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator validator;  //gives us access to the validator
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp"; //rendering from WEB-INF
	}
	
	//Register New User  (return errors if fields left blank or incorrect information)
	//POST mapping anything coming from the front end to the backend
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) { //session lets us know which user it is

		validator.validate(user, result);
		
		if(result.hasErrors()) {
			return "index.jsp";
		}
		User newUser = this.userService.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		System.out.println("New registered user:  " + user.getFirstName() + " " + user.getLastName() + " / email: " + user.getEmail());
		return "redirect:/dashboard"; //redirect goes to another endpoint or page
	}
	
	//Login Existing User --Authentication (return errors if fields left blank or incorrect information)
	@PostMapping("/login")
	public String login(@RequestParam("loginEmail") String email, @RequestParam("loginPassword") String password, RedirectAttributes redirectAttrs, HttpSession session) {
		if(!this.userService.authenticateUser(email, password)){
			redirectAttrs.addFlashAttribute("loginError", "Invalid Credentials!");
			return "redirect:/";

		}
		User user = this.userService.getByEmail(email);
		session.setAttribute("user", user.getId());
		System.out.println(user.getFirstName() + " " + user.getLastName() + " logged in.");
		return "redirect:/dashboard";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model viewModel) {
		
		if(session.getAttribute("user") == (null)){
			return "redirect:/";
		}
		Long userId = (Long)session.getAttribute("user");
		User user = this.userService.getById(userId);
		viewModel.addAttribute("user", user);
		return "dashboard.jsp"; //rendering from WEB-INF)
	}	
	
	//Logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
