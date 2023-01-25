package com.springBoot.WebGames.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String redirectHome() {
		
		return "redirect:home";
	}
	
	
	@RequestMapping("/home")
	public String mainMenu(Principal principal, HttpSession session) {
		String name = principal != null ? principal.getName() : "Anonymous";
		session.setAttribute("name", name);
		return "home";
	}
}
