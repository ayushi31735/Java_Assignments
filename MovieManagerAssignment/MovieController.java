package com.techlabs.assignment;

import java.io.IOException;
import java.util.Scanner;

public class MovieController {
	
	private MovieManager manager;

	public MovieController(MovieManager manager) {
		super();
		this.manager = manager;
	}
	
	public void start() throws IOException
	{
		displayMenu();
	}

	public void displayMenu() throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Add Movie");
			System.out.println("2. Show All Movies");
			System.out.println("3. Show Movie Details By ID");
			System.out.println("4. Delete Movies By ID");
			System.out.println("5. Clear All Movies");
			System.out.println("Press 0 to exit");
			
			int choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1:
					Movie newMovie = setMovieDetails(scanner);
					manager.addMovie(newMovie);
					manager.saveMovies();
					System.out.println("Movie Added Successfully");
					break;
					
				case 2:
					displayAllMovies();
					break;
					
				case 3:
					showMovie(scanner);
					break;
					
				case 4:
					deleteMovie(scanner);
					break;
				
				case 5:
					manager.clearMovies();
					System.out.println("All Movies Deleted");
					break;
					
				case 0:
					System.out.println("Thank You.....");
					System.exit(0);
					
				default:
					System.out.println("Invalid");
			}
		}
		
	}

	public void deleteMovie(Scanner scanner) {
		System.out.println("Enter Movie ID: ");
		int id = scanner.nextInt();
		manager.deleteMovies(id);
		
	}

	public void showMovie(Scanner scanner) {
		System.out.println("Enter Movie ID: ");
		int id = scanner.nextInt();
		Movie movie = manager.getMovieById(id);
		System.out.println(movie);
	}

	private void displayAllMovies() {
		System.out.println("List of Movies");
		for(Movie movie : manager.getMovies())
		{
			System.out.println(movie);
		}
		
	}

	private Movie setMovieDetails(Scanner scanner) {
		System.out.println("Enter Movie Name: ");
		String name = scanner.next();
		System.out.println("Enter Movie Year: ");
		int year = scanner.nextInt();
		System.out.println("Enter Movie genre: ");
		String genre = scanner.next();
		
		int id = manager.getMovieId();
		return new Movie(id,name,year,genre);
	}

}
