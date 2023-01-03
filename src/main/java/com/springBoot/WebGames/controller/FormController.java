package com.springBoot.WebGames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String processLogin(@ModelAttribute("user") User user) {

		return "confirmation-login";

	}

	@RequestMapping("/processSignupForm")
	public String processSignup(@ModelAttribute("user") User user) {

		return "confirmation-signup";

	}

}
