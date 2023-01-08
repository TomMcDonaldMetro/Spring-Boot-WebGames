package com.springBoot.WebGames.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBoot.WebGames.model.Tictactoe;
import com.springBoot.WebGames.model.Tictactoe.Mark;

@Controller
@RequestMapping("/menu")
public class GamesMenuController {
	
	
	@RequestMapping("")
	public String menu() {
		
		return "games-menu";
	}

	@RequestMapping("/tictactoe")
	public String tictactoe(Model model, HttpSession session, @RequestParam(required = false) String loc) {
		if(session.getAttribute("game") == null) {
			session.setAttribute("game", new Tictactoe());

		} else {
			int loce = Integer.parseInt(loc);
			((Tictactoe)session.getAttribute("game")).placeMark(loce);
			Mark[] board = ((Tictactoe)session.getAttribute("game")).getBoard();
			for (Mark mark : board) {
				System.out.println(mark);
			}
		}
			
		
		return "tictactoe";
	}
	
	
	
}
