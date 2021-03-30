package com.lvbullock.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	//listen for requests
	//localhost:8080
	
	//Have an http GET request to 'http://localhost:8080/coding' display a text that says 'Hello Coding Dojo!'.

	@RequestMapping("/coding")
	public String helloCodingDojo() {
		//RESPONSE
		return "Hello Coding Dojo!";
	}
	
	//Have an http GET request to 'http://localhost:8080/coding/python' display a text that says 'Python/Django was awesome!'.

	@RequestMapping("/coding/python")
	public String python() {
		//RESPONSE
		return "Python/Django was very challenging, but awesome!";
	}
	
	//Have an http GET request to 'http://localhost:8080/coding/java' display a text that says 'Java/Spring is better!'.
	@RequestMapping("/coding/java")
	public String java() {
		//RESPONSE
		return "Java/Spring some say better, but it is very confusing!  Will it ever be awesome?  Hmmm, to be continued...";
	}
}
