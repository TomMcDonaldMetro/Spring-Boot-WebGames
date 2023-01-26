package com.springBoot.WebGames.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/login")
	public String showLogin(HttpServletRequest request) {
		String logout = request.getParameter("logout");
		String login = logout == null ? "login-form" : "home";
		return login;
	}

	@RequestMapping("/signup")
	public String showSignupForm() {
		

		return "signup-form";
	}
	
	

	@RequestMapping("/processLoginForm")
	public String processLogin(HttpServletRequest request, @ModelAttribute("user") User user) {
		System.out.println(user.getFirstName() + " " + user.getFirstName());
		request.getSession(true).setAttribute("user", user);
		return "confirmation-login";

	}

	@RequestMapping("/processSignupForm")
	public String processSignup(HttpServletRequest request, @ModelAttribute("user") User user) {
		
		System.out.println(user.getFirstName());
		request.getSession(true).setAttribute("user", user);
		return "redirect:/home";

	}
	
	@RequestMapping("/processLogout")
	public String processLogout() {
		return "processLogout";
	}

}
