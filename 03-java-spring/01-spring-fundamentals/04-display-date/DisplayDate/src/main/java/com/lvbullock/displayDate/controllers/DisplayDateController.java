package com.lvbullock.displayDate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

//Create an app that will render three pages.

public class DisplayDateController {
	//Render one home page as the dashboard with links to the two others.
	@RequestMapping("/")
	public String index(Model model) {
		return "home.jsp";
	}
	
	//Render one page at /date with the current date formatted as Saturday, the 22 of January, 2028
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "showDate.jsp";
	}
	
	//Render one page at /time with the current time formatted as 11:30 PM
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		model.addAttribute("time", time);
		return "showTime.jsp";
	}
}

/*Assignment: Display Date - http://learn.codingdojo.com/m/145/6906/49936
Your project manager needs you to make two template for her front-end team: one to display the current date, and one to display the current time. Use the JSTL library to format the date so the front end developers can edit easily!

Topics:
- Passing Data
- Routing
- Time formatting

Tasks:
- Use new java.util.Date() in your controller to get the date.
- Create an app that will render three pages.
- Render one home page as the dashboard with links to the two others.
- Render one page at /date with the current date formatted as Saturday, the 22 of January, 2028
- Link an external javascript file to the /date template that alerts "This is the date template".
- Link an external css file to the /date template that colors the date in blue.
- Render one page at /time with the current time formatted as 11:30 PM
- Link a external javascript file to the /time template that alerts "This is the time template".
- Link a external css file to the /time template that says colors the time in green.*/
