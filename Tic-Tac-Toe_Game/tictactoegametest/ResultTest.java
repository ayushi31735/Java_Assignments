package com.techlabs.tictactoegame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultTest {
	
	Result result;
	Board board;
	Cell cell;
	Player player;
	
	@BeforeEach
	void init()
	{
		result = new Result();
		board = new Board();
		cell = new Cell();
		player = new Player("Ayushi","Isha");
		board.setCellNumber();
	}
	
	@Test
	void testHorizontalWinnerCheck()
	{
		for(int i=0;i<3;i++)
		{
			cell.setMark(MarkType.X, i+1, board);
		}
		assertEquals("Ayushi", result.horizontalWinnerCheck(board, player));
		
	}
	
	@Test
	void testVerticalWinnerCheck()
	{
		cell.setMark(MarkType.O, 1, board);
		cell.setMark(MarkType.O, 4, board);
		cell.setMark(MarkType.O, 7, board);
		assertEquals("Isha", result.verticalWinnerCheck(board, player));
		
	}
	
	@Test
	void testDiagonalWinnerCheck()
	{
		cell.setMark(MarkType.O, 1, board);
		cell.setMark(MarkType.O, 5, board);
		cell.setMark(MarkType.O, 9, board);
		assertEquals("Isha", result.diagonalWinnerCheck(board, player));
		
	}

	@Test
	void testCheckDraw() {
		for(int i=0;i<6;i = i+2)
		{
			cell.setMark(MarkType.X, i+1, board);
			cell.setMark(MarkType.O, i+2, board);
		}
		cell.setMark(MarkType.O, 7, board);
		cell.setMark(MarkType.X, 8, board);
		cell.setMark(MarkType.O, 9, board);
		assertEquals("Game Draw",result.checkDraw(board, "Player1"));
//		assertEquals(null,result.checkDraw(board, "Player1"));
	}

}
