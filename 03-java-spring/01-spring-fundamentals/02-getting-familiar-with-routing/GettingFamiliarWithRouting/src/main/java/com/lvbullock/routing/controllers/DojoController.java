package com.lvbullock.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	//	//Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
	@RequestMapping("/dojo")
	public String dojo() {
	//RESPONSE
		String dojo = "Virtual Dojo";

	return "The " + dojo + " is awesome!";
	}
	
	//Have an http GET request to 'http://localhost:8080/dojo/burbank' display a text that says 'Burbank Dojo is located in Southern California'.
	@RequestMapping("/dojo/{city}")
	public String dojoCenter(@PathVariable("city") String city) {
		
        if(city.equals ("burbank")){
    		return city.substring(0,1).toUpperCase() + city.substring(1) + " Dojo is located in Southern California.";
        }
       // Have an http GET request to 'http://localhost:8080/dojo/san-jose' display a text that says 'SJ dojo is the headquarters'.

        else if(city.equals ("san-jose")){
    		return "SJ Dojo is the headquarters.";
        }
        else{
    		return "";
        }
	}
}
