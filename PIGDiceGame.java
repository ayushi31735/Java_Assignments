package com.techlabs.arrays;

import java.util.Random;
import java.util.Scanner;

public class PIGDiceGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to PIG Dice Game.......");
		System.out.println("Want to Play..... (Yes/No).......");
		String playOrNot = "";
		playOrNot = scanner.next();
		int numberOfTurns = 1;
		System.out.println("TURN "+numberOfTurns);
		if(playOrNot.equalsIgnoreCase("no"))
		{
			System.out.println("Thanks For Playing.....");
			System.exit(0);
		}
		int totalScore = 0;
		int roundPoints = 0;
		play(scanner,numberOfTurns,totalScore,roundPoints);
	}

	public static void play(Scanner scanner, int numberOfTurns, int totalScore, int roundPoints) {
		
		System.out.print(numberOfTurns+"	"+totalScore+"	"+roundPoints);
		System.out.println();
		
		String choice = select(scanner);
		
		if(choice.equalsIgnoreCase("r"))
		{
			rollDice(scanner,numberOfTurns,totalScore,roundPoints);
		}
		else if(choice.equalsIgnoreCase("h"))
		{
			holdDice(scanner,numberOfTurns,totalScore,roundPoints);
		}
		System.out.println("Invalid......!!!");
		play(scanner,numberOfTurns,totalScore,roundPoints);
	}

	public static String select(Scanner scanner) {
		System.out.println();
		System.out.println("Enter your choice..... roll or hold??? (r/h).......");
		String choice = scanner.next();
		return choice;
	}

	public static void rollDice(Scanner scanner, int numberOfTurns, int totalScore, int roundPoints) {
		
		Random random = new Random();
		int dieNumber = random.nextInt(6)+1;
		//System.out.println("Enter number between 1 to 6");
		//int dieNumber = scanner.nextInt();
		System.out.println("You got-----> "+dieNumber);
		if(dieNumber == 1)
		{
			numberOfTurns++;
			totalScore = 0;
			roundPoints = 0;
			System.out.println("Turn Over.... No Score.....");
			System.out.println("TURN "+numberOfTurns);
			play(scanner,numberOfTurns,totalScore,roundPoints);
			return;
		}
		roundPoints = roundPoints + dieNumber;
		totalScore = totalScore + dieNumber;
		System.out.println("Score for this Turn------> "+roundPoints);
		System.out.println("Total Score------> "+totalScore);
		play(scanner,numberOfTurns,totalScore,roundPoints);
	}
	
	public static void holdDice(Scanner scanner, int numberOfTurns, int totalScore, int roundPoints) {
		System.out.println("Score for this Turn------> "+roundPoints);
		System.out.println("Total Score------> "+totalScore);
		if(totalScore >= 20)
		{
			System.out.println("You Finished in "+numberOfTurns+" Turns");
			System.out.println("Game Over");
			System.exit(0);
		}
		roundPoints = 0;
		numberOfTurns++;
		System.out.println("TURN "+numberOfTurns);
		play(scanner,numberOfTurns,totalScore,roundPoints);
	}

}
