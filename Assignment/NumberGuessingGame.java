package com.techlab.intro;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		playOrNot(scanner);
	}

	public static void playOrNot(Scanner scanner) {
		
		System.out.println("Do you want to Play enter (Yes/No)");
		String choice = scanner.next();
		if(choice.equalsIgnoreCase("no"))
		{
			System.out.println("Thank You for playing....");
			System.exit(0);
		}
		int number = generateNumber();
		int numberOfAttempts = 0;
		int limit = 10;
		play(scanner,number,numberOfAttempts,limit);
	}
	
	public static int generateNumber() {
		Random random = new Random();
		int number = random.nextInt(100)+1;
		System.out.println(number);
		return number;
	}

	public static void play(Scanner scanner,int number,int numberOfAttempts,int limit) {
		
		if(limit == 0)
		{
			System.out.println("Sorry.... You lose");
			playOrNot(scanner);
		}
		
		System.out.print("Guess a number: ");
		int guessedNumber = scanner.nextInt();
		if(guessedNumber <= 0 || guessedNumber > 100)
		{
			System.out.println("Please enter number between 1 to 100");
			numberOfAttempts++;
			limit--;
		}
		else if(guessedNumber == number)
		{
			numberOfAttempts++;
			System.out.println("You guessed the correct number in "+numberOfAttempts+" Attempts");
			playOrNot(scanner);
		}
		else if(guessedNumber > number)
		{
			numberOfAttempts++;
			limit--;
			System.out.println("Sorry... Too High...");
			play(scanner,number,numberOfAttempts,limit);
		}
		else
		{
			numberOfAttempts++;
			limit--;
			System.out.println("Sorry... Too Low...");
			play(scanner,number,numberOfAttempts,limit);
		}
	}

}
