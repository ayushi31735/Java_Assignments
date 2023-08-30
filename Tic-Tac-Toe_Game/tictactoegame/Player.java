package com.techlabs.tictactoegame;

public class Player {
	
	private String player1name;
	private String player2name;
	
	public Player(String player1name, String player2name) {
		super();
		this.player1name = player1name;
		this.player2name = player2name;
	}
	
	public String getPlayer1name() {
		return player1name;
	}

	public void setPlayer1name(String player1name) {
		this.player1name = player1name;
	}

	public String getPlayer2name() {
		return player2name;
	}

	public void setPlayer2name(String player2name) {
		this.player2name = player2name;
	}
	
	public String switchPlayer(String playerName)
	{
		if(playerName.equals(getPlayer1name()))
			return getPlayer2name();
		else
			return getPlayer1name();
	}

	public void printName()
	{
		System.out.println("Player 1: "+player1name);
		System.out.println("Player 2: "+player2name);
		System.out.println();
	}
}
