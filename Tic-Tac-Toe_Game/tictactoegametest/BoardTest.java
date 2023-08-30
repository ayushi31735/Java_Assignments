package com.techlabs.tictactoegame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {

	Board board;
	Cell cell;
	
	@BeforeEach
	void init()
	{
		board = new Board();
		cell = new Cell();
	}
	
	@Test
	void testSetCellNumber()
	{
		board.setCellNumber();
		for(int i=0;i<9;i++)
		{
			assertEquals(i+1,Integer.parseInt(board.getBoard()[i]));
		}
	}
	
	@Test
	void testIsFull() {
		
		board.setCellNumber();
		for(int i=1;i<=9;i++)
		{
			cell.setMark(MarkType.X, i, board);
		}
		assertTrue(board.isFull(board, "Player 1"));
	}

}
