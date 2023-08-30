package com.techlabs.tictactoegame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayTest {
	
	Play play;
	
	@BeforeEach
	void init()
	{
		play = new Play();
	}

	@Test
	void testUpdateCellMark() {
		assertEquals("X",play.updateCellMark("O"));
	}
	
	@Test
	void testInvalidInputException()
	{
		int cellnumber = 10;
		assertThrows(InvalidInputException.class, () -> {if(cellnumber<0 || cellnumber > 9)
														{
															throw new InvalidInputException(cellnumber);
														}});
	}

}
