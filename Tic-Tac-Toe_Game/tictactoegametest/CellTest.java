package com.techlabs.tictactoegame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CellTest {

	Board board;
	Cell cell;
	
	@BeforeEach
	void init()
	{
		board = new Board();
		cell = new Cell();
	}
	
	@Test
	void testIsEmpty() {
		board.setCellNumber();
		boolean expected = true;
		assertEquals(expected,cell.isEmpty(1, board));
	}

	@Test
	void testGetMark() {
		assertEquals(MarkType.X,cell.getMark("X"));
	}

	@Test
	void testSetMark() {
		board.setCellNumber();
		boolean expected = true;
		boolean actual = cell.setMark(MarkType.X, 2, board);
		assertEquals(expected,actual);
	}
	
	@Test
	void testCellAlreadyMarkedException()
	{
		board.setCellNumber();
		cell.setMark(MarkType.X, 2, board);
		assertThrows(CellAlreadyMarkedException.class, () ->{throw new CellAlreadyMarkedException(2);});
	}

}
