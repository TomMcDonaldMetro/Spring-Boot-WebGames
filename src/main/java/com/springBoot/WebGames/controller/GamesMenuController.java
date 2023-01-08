package com.springBoot.WebGames.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBoot.WebGames.model.Reversi;
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
	public String tictactoe(Model model, HttpServletRequest request, @RequestParam(required = false) String loc,
			@RequestParam(required = false) String newGame) {
		if (request.getSession().getAttribute("game") == null) {
			request.getSession(true).setAttribute("game", new Tictactoe());

		} else {
			if (newGame != null) {
				request.getSession(true).setAttribute("game", new Tictactoe());
			} else if (loc != null && loc.matches("[0-8]")) {
				int loce = Integer.parseInt(loc);
				((Tictactoe) request.getSession().getAttribute("game")).placeMark(loce);
				Mark[] board = ((Tictactoe) request.getSession().getAttribute("game")).getBoard();
				for (Mark mark : board) {
					System.out.println(mark);
				}
			}

		}

		return "tictactoe";
	}

	@RequestMapping("/reversi")
	public String reversi(HttpServletRequest request, @RequestParam(required = false) String loc,
			@RequestParam(required = false) String quit) {

		if (request.getSession(true).getAttribute("reversi") == null) {
			request.getSession(true).setAttribute("reversi", new Reversi());
		} else {
			if (quit != null) {
				request.getSession().setAttribute("reversi", new Reversi());
			} else if (loc != null && loc.matches("([0-9]|[1-9][0-9])")) {
				int loce = Integer.parseInt(loc);
				// 3. do it
				((Reversi) request.getSession(true).getAttribute("reversi")).placeMark(loce);
			}

			
		}
		return "reversi";

	}

}
