package com.techlabs.tictactoegame;

public class Board {
	
	private String[] board;
	
	public Board(){
		board = new String[9];
	}
	
	public String[] getBoard() {
		return board;
	}

	public void setBoard(String[] board) {
		this.board = board;
	}

	public void setCellNumber()
	{
		for (int i=0;i<9;i++) 
		{
            board[i] = String.valueOf(i+1);
        }
	}
	
	public boolean isFull(Board board,String winner)
	{
		int count = 0;
		for(int i=0;i<9;i++)
		{
			if(board.getBoard()[i].equals("X") || board.getBoard()[i].equals("O"))
				count++;
		}
		if(count == 9)
			return true;;
		return false;
	}
	
	public void printBoard()
	{
		System.out.println("BOARD");
		System.out.println("|---|---|---|");
	    System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
	    System.out.println("|---|---|---|");
	    System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
	    System.out.println("|---|---|---|");
	    System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
	    System.out.println("|---|---|---|");
	}
	
}
