package com.techlabs.tictactoegame;

import java.util.Arrays;

public class Result {
	
	public String horizontalWinnerCheck(Board board,Player player)
	{
		for (int a = 0; a < 3; a++) {
            String line = null;
 
            switch (a) {
            case 0:
                line = board.getBoard()[0] + board.getBoard()[1] + board.getBoard()[2];
                break;
            case 1:
                line = board.getBoard()[3] + board.getBoard()[4] + board.getBoard()[5];
                break;
            case 2:
                line = board.getBoard()[6] + board.getBoard()[7] + board.getBoard()[8];
                break;
            }
            
            if (line.equals("XXX")) {
                return player.getPlayer1name();
            }
             
            else if (line.equals("OOO")) {
                return player.getPlayer2name();
            }
          
        }
		return null;
	}
	
	public String verticalWinnerCheck(Board board,Player player)
	{
		for (int a = 0; a < 3; a++) {
            String line = null;
 
            switch (a) {
            case 0:
                line = board.getBoard()[0] + board.getBoard()[3] + board.getBoard()[6];
                break;
            case 1:
                line = board.getBoard()[1] + board.getBoard()[4] + board.getBoard()[7];
                break;
            case 2:
                line = board.getBoard()[2] + board.getBoard()[5] + board.getBoard()[8];
                break;
            }
            
            if (line.equals("XXX")) {
                return player.getPlayer1name();
            }
             
            else if (line.equals("OOO")) {
                return player.getPlayer2name();
            }
          
        }
		return null;
	}
	
	public String diagonalWinnerCheck(Board board,Player player)
	{
		for (int a = 0; a < 2; a++) {
            String line = null;
 
            switch (a) {
            case 0:
                line = board.getBoard()[0] + board.getBoard()[4] + board.getBoard()[8];
                break;
            case 1:
                line = board.getBoard()[2] + board.getBoard()[4] + board.getBoard()[6];
                break;
            }
            
            if (line.equals("XXX")) {
                return player.getPlayer1name();
            }
             
            else if (line.equals("OOO")) {
                return player.getPlayer2name();
            }
          
        }
		return null;
	}
	
	public String checkDraw(Board board,String winner)
	{
		boolean check = board.isFull(board, winner);
		if(check == true)
			return "Game Draw";
		return null;
	}
	
	public void printWinner(String winner)
	{
		if(winner.equals("Game Draw"))
			System.out.println("It is a tie...");
		else
			System.out.println("Congratulations....!! "+winner+" is the winner");
	}

}
