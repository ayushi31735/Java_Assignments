package com.techlabs.tictactoegame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	
	Player player;
	
	@BeforeEach
	void init()
	{
		player = new Player("Isha","Ayushi");
	}

	@Test
	void testSwitchPlayer() {
		assertEquals("Ayushi",player.switchPlayer("Isha"));
	}

}
