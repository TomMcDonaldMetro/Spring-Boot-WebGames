package com.springBoot.WebGames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/menu")
public class GamesMenuController {

	@RequestMapping("/tictactoe")
	public String tictactoe(@RequestParam("press") String pressed) {
		System.out.println(pressed);
		return "tictactoe";
	}
	
	
	
}
