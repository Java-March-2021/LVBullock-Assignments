package com.lvbullock.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {

	//listen for requests on localhost:8080
	
	//When a user visits the root route, have a nice message appear for the client.
	@RequestMapping("/") //this is also localhost:8080   <--This is the REQUEST
	public String greetingsClient() {
		
		//RESPONSE
		return "Greetings client! Welcome to the Java Stack from Laura Bullock in the March 2021 Cohort.";
	}
	
	//enter localhost:8080/random in address bar
	//When a user visits the '/random' route, have a nice message about Spring Boot appear for the client.
	@RequestMapping("/random")  //This REQUEST goes to the "random" page
	public String random() {
		
		//RESPONSE
		return "I guess Spring Boot is Great for some; not so much for me.  You may be asking if you saw this page from me before; the answer is Yes.  This is ANOTHER do-over.  I am still struggling with Java.";
	}
}

/*Strings Assignment - March 2021
In this assignment, you will create a Spring Boot application that will respond with some hard coded text for two routes.

Topics:
- New Spring Boot project
- Annotations
- Dependencies
- Methods

Tasks:
- Create a brand new Spring Boot application
- When a user visits the root route, have a nice message appear for the client.
- When a user visits the '/random' route, have a nice message about Spring Boot appear for the client.*/

