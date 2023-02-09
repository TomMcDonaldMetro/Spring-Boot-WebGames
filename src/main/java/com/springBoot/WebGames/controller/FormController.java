package com.springBoot.WebGames.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springBoot.WebGames.hibernate.dao.UserDAO;
import com.springBoot.WebGames.hibernate.entity.User;

@Controller
public class FormController {

	@Autowired private UserDAO dao;
	
	@RequestMapping("/login")
	public String showLogin(HttpServletRequest request) {
		String logout = request.getParameter("logout");
		
		String login = logout == null ? "login-form" : "home";
		return login;
	}

	@RequestMapping("/signup")
	public String showSignupForm(Model model) {
		
		User user = new User();
		model.addAttribute("user", user);

		return "signup-form";
	}

	@RequestMapping("/processSignupForm")
	public String processSignup(@ModelAttribute("user") User user, Model model) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println(user.getId());
		System.out.println(user.getUsername());
		
		try {
			// check to see if username is already taken.
			User temp = dao.findByUsername(user.getUsername());
			if(temp != null && temp.getUsername().equals(user.getUsername())) {
				System.out.println("name already taken");
				model.addAttribute("error", "Username already taken.");
				return "signup-form";
			}
			// if it has been taken send an error
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			// if it is available, save and continue.
			dao.save(user);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return "home";

	}
	
	@RequestMapping("/processLogout")
	public String processLogout() {
		return "processLogout";
	}

}
