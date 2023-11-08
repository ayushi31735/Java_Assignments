package com.techlabs.assignment;

import java.io.IOException;

public class MovieTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		MovieManager movieManager = new MovieManager();
		MovieController movieController = new MovieController(movieManager);
		movieController.start();
		
	}

}
