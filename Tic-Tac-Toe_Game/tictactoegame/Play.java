package com.techlabs.tictactoegame;

import java.util.Scanner;

public class Play {
	
	public void play()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****Welcome to 3*3 Tic-Tac-Toe Game*****");
		System.out.println("1st Player will Mark 'X' \n2nd Player will Mark 'O'");
		
		Board board = new Board();
		Player player = setPlayer(scanner,board);
		
		board.setCellNumber();
		board.printBoard();
		
		startPlaying(scanner,board,player);
		
	}

	public void startPlaying(Scanner scanner,Board board,Player player) {
		String winner = null;
		String turn = "X";
		int cellnumber=0;
		String playerName = player.getPlayer1name();
	
		Cell cell = new Cell();
		Result result = new Result();
		
		while(winner == null)
		{
			System.out.println(playerName+"'s Turn. Mark --> "+turn);
			System.out.print("Enter a cell number between 1-9: ");
			
			try 
			{
				cellnumber = scanner.nextInt();
				if(! (cellnumber>0 && cellnumber<=9))
				{
					throw new InvalidInputException(cellnumber);
				}
			}
			catch(InvalidInputException e)
			{
				System.out.println(e.getMessage());
			}
			
			MarkType mark = cell.getMark(turn);
			boolean isset = cell.setMark(mark,cellnumber,board);
			if(isset == true)
			{
				turn = updateCellMark(turn);
				playerName = player.switchPlayer(playerName);
			}
	
			//winner = result.checkWinner(board,player);
			
			winner = result.horizontalWinnerCheck(board, player);
			if(winner == null)
				winner = result.verticalWinnerCheck(board, player);
			if(winner == null)
				winner = result.diagonalWinnerCheck(board, player);
			if(winner == null)
				winner = result.checkDraw(board,winner);
		}
		result.printWinner(winner);
		
		playAgain(scanner);
		
	}

	public String updateCellMark(String turn) {
		
		if(turn.equals("X"))
			return "O";
		else
			return "X";
	}

	public void playAgain(Scanner scanner) {
		System.out.println("Do you want to play again..?? (Yes/No)");
		String playOrNot = scanner.next();
		if(playOrNot.equalsIgnoreCase("No"))
		{
			System.out.println("Thank You...!!!");
			System.exit(0);
		}
		else if(playOrNot.equalsIgnoreCase("Yes"))
			play();
	}

	public Player setPlayer(Scanner scanner,Board board) {
		System.out.print("Enter 1st Player's Name: ");
		String name1 = scanner.next();
		
		System.out.print("Enter 2nd Player's Name: ");
		String name2 = scanner.next();
		
		Player player = new Player(name1,name2);
		player.printName();
		return player;
		
	}
	
}
