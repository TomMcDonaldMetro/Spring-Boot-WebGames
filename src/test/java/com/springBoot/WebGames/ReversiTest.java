package com.springBoot.WebGames;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.springBoot.WebGames.model.Reversi;
import com.springBoot.WebGames.model.Reversi.Marker;

class ReversiTest {

	
	
	// a move cannot be made using one edge of the board to influence the other > [x - - - x o]
	@Test
	void edgeTest() {
		Reversi reversi = new Reversi();
		// set up board
		Marker[] board = reversi.getGrid();
		
		// [- o x o x - x o]
		// manually setting the board.
		board[26] = Marker.BLACK;
		board[30] = Marker.BLACK;
		board[31] = Marker.WHITE;
		board[25] = Marker.WHITE;
		
		// black moves first
		// legal move, but should not influence the tile on the right-hand side.
		reversi.placeMark(24);
		
		assertTrue(board[31].getMarker().toLowerCase().equals("white"));
	}
	
	// a move cannot be made using one edge of the board to influence the other[o x - - - x] <
		@Test
		void edgeTest2() {
			Reversi reversi = new Reversi();
			// set up board
			Marker[] board = reversi.getGrid();
			
			// [o x - o x x o -] 
			// manually setting the board.
			board[25] = Marker.BLACK;
			board[29] = Marker.BLACK;
			board[30] = Marker.WHITE;
			board[24] = Marker.WHITE;
			
			// black moves first
			// legal move, but should not influence the tile on the right-hand side.
			reversi.placeMark(31);
			
			assertTrue(board[24].getMarker().toLowerCase().equals("white"));
		}
	
	// a move cannot be made using one edge of the board to influence the other[- - - - x o]
	//	this edge would check steps backwards for legal moves.        		 > [x - - - - -]
		@Test
		void edgeTestsStepBack() {
			Reversi reversi = new Reversi();
			// set up board
			Marker[] board = reversi.getGrid();
			
			// [- - - x o - x o]
			// manually setting the board.
			board[30] = Marker.BLACK;
			board[31] = Marker.WHITE;
			
			// black moves first
			// illegal move. If it influenced the opposite side of the board it would return true.
			assertFalse(reversi.placeMark(32));
			
			
		}
		
		// a move cannot be made using one edge of the board to influence the other[- - - - - x] <
		//	this edge would check steps forward for legal moves.        		   [o x - - - -]
			@Test
			void edgeTestsStepForward() {
				Reversi reversi = new Reversi();
				// set up board
				Marker[] board = reversi.getGrid();
				
				// [- - - x o - x o]
				// manually setting the board.
				board[25] = Marker.BLACK;
				board[24] = Marker.WHITE;
				
				// black moves first
				// illegal move. If it influenced the opposite side of the board it would return true.
				assertFalse(reversi.placeMark(23));
				
				
			}

}
