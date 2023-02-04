package com.springBoot.WebGames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

	/**
	 * 
	 * @return the jsp name of the about page to be displayed on request.
	 */
	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}
}
