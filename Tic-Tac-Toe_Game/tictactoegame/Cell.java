package com.techlabs.tictactoegame;

public class Cell {
	
	private MarkType mark;

	public Cell() {
		mark = MarkType.EMPTY;
	}
	
	public MarkType getMark() {
		return mark;
	}

	public boolean isEmpty(int cell,Board board)
	{
		if(board.getBoard()[cell-1].equals("X") || board.getBoard()[cell-1].equals("O"))
			return false;
		return true;
	}
	
	public MarkType getMark(String turn)
	{
		if(turn.equals("X"))
			return mark.X;
		if(turn.equals("O"))
			return mark.O;
		return mark.EMPTY;
	}
	
	public boolean setMark(MarkType mark,int cellnumber,Board board)
	{
		try {
			boolean emptyOrNot = isEmpty(cellnumber,board);
			if(emptyOrNot == false)
				throw new CellAlreadyMarkedException(cellnumber);
			if(emptyOrNot == true)
			{
				 board.getBoard()[cellnumber - 1] = mark.toString();
				 board.printBoard();
				 return true;
			}
		}
		catch(CellAlreadyMarkedException e)
		{
			System.out.println(e.getMessage());
		}
		return false;
	}
}
