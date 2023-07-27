package com.techlab.intro;

import java.util.Scanner;

public class GameTreasureIsland {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island.");
		System.out.println("Your Mission is to find the Treasure.");
		
		System.out.println("Do You want to play?? (Yes/No)");
		String choice = scanner.next();
		
		if(choice.equalsIgnoreCase("No"))
		{
			System.out.println("Thanks For Playing...");
			return;
		}
		
		play(scanner);
		
	}

	public static void play(Scanner scanner) {
		System.out.println("Where you want to go?");
		System.out.println("Left or Right");
		String path = scanner.next();
		if(path.equalsIgnoreCase("left"))
		{
			System.out.println("What you want to do?");
			System.out.println("Swim or Wait");
			String work = scanner.next();
			if(work.equalsIgnoreCase("wait"))
			{
				System.out.println("Through which door you want to go?");
				System.out.println("Red / Yellow / Blue");
				String door= scanner.next();
				if(door.equalsIgnoreCase("Red"))
				{
					System.out.println("Burned by fire");
					System.out.println("Game Over");
				}
				else if(door.equalsIgnoreCase("Yellow"))
				{
					System.out.println("You Win");
					System.out.println("Do You want to play Again?? (Yes/No)");
					String choice = scanner.next();
					
					if(choice.equalsIgnoreCase("No"))
					{
						System.out.println("Thanks For Playing...");
						return;
					}
					
					play(scanner);
					
				}
				else if(door.equalsIgnoreCase("Blue"))
				{
					System.out.println("Eaten by the beasts");
					System.out.println("Game Over");
				}
				else
					System.out.println("Game Over");
			}
			else
			{
				System.out.println("Attacked by trout");
				System.out.println("Game Over");
			}
		}
		else
		{
			System.out.println("Fall into a hole");
			System.out.println("Game Over");
		}
	}

}
