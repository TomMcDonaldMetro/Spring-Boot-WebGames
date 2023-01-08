package com.springBoot.WebGames.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springBoot.WebGames.model.User;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String mainMenu(HttpServletRequest request, Model model) {
		try {
			System.out.println(((User)request.getSession().getAttribute("user")).getFirstName());
		} catch(Exception e) {
			
		} finally {
			
		}
		return "home";
	}
}
