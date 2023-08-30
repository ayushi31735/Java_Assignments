package com.techlabs.tictactoegame;

public class InvalidInputException extends RuntimeException{
	
	private int cellnumber;

	public InvalidInputException(int cellnumber) {
		super();
		this.cellnumber = cellnumber;
	}
	
	public String getMessage()
	{
		return "Cell "+cellnumber+" is Invalid.. Enter Another Cell number from 1 to 9";
	}
}
