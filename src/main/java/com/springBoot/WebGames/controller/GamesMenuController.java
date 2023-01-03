package com.springBoot.WebGames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class GamesMenuController {

	@RequestMapping("/tictactoe")
	public String tictactoe() {
		return "tictactoe";
	}
	
	
	
}
