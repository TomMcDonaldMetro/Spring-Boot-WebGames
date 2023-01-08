package com.springBoot.WebGames.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springBoot.WebGames.model.User;

@Controller
public class FormController {

	@RequestMapping("/login")
	public String showForm(Model theModel) {
		// create student object
		User user = new User();

		// add student object to the model
		theModel.addAttribute("user", user);

		return "login-form";
	}

	@RequestMapping("/signup")
	public String showSignupForm(Model theModel) {
		// create user object
		User user = new User();
		// add student object to the model
		theModel.addAttribute("user", user);

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

}
