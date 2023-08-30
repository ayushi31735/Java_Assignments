package com.techlabs.tictactoegame;

public class CellAlreadyMarkedException extends RuntimeException{
	
	private int cellnumber;

	public CellAlreadyMarkedException(int cellnumber) {
		super();
		this.cellnumber = cellnumber;
	}
	
	public String getMessage()
	{
		return "Cell "+cellnumber+" Already Marked.. Enter Another Cell number";
	}
}
