package com.lvbullock.ninjagold.controllers;

import java.util.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
	
	@GetMapping("/")
	public String gold(HttpSession session, Model viewModel) {
		ArrayList<String> activity = new ArrayList<String>();
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if(session.getAttribute("activity") == null) {
			session.setAttribute("activity", activity);
		}
		viewModel.addAttribute("totalGold", session.getAttribute("gold"));
		viewModel.addAttribute("activity", session.getAttribute("activity"));
		return "gold.jsp";
	}
	
	@PostMapping("/findgold")
	public String goldProcessing(HttpSession session, @RequestParam("location") String location, Model viewModel) {
		Random r = new Random();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm a");  

		LocalDateTime now = LocalDateTime.now();
		viewModel.addAttribute("now", now);
		System.out.println(dtf.format(now));
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		int gold = (int)session.getAttribute("gold");
		int goldEarned;
		// Logic for earning/losing gold
		if(location.equals("FARM")) {
			// Farm earns a random value between 10 and 20
			goldEarned = r.nextInt((20 - 10) + 1) + 10;
			activity.add(String.format("You have entered a %s - Earned:  %d gold coins (\n" + dtf.format(now) + " )", location, goldEarned));
		} else if(location.equals("CAVE")) {
			// Cave earns a random value between 5 and 10
			goldEarned = r.nextInt((10 - 5) + 1) + 5;
			activity.add(String.format("You have entered a %s - Earned:  %d gold coins (\n" + dtf.format(now) + " )", location, goldEarned));
		} else if(location.equals("HOUSE")) {
			// House earns a random value between 2 and 5
			goldEarned = r.nextInt((5 - 2) + 1) + 2;
			activity.add(String.format("You have entered a %s - Earned:  %d gold coins (\n" + dtf.format(now) + " )", location, goldEarned));
		} else {
			// Casino earns or loses a random value between 0 and 50
			goldEarned = r.nextInt((50 + 50) + 1) - 50;
			if(goldEarned < 0) {
				activity.add(String.format("%s - gold coins LOST:  %d (\n" + dtf.format(now) + " )", location, goldEarned));
			} else {
			activity.add(String.format("You have entered a %s - Earned:  %d gold coins (\n" + dtf.format(now) + " )", location, goldEarned));
			}
		}
		
		int totalGold = gold += goldEarned;
		session.setAttribute("gold", totalGold);
		session.setAttribute("activity", activity);
		return "redirect:/";
	}
}
