package com.techlabs.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MovieManager{
 
	private List<Movie> movies;
	static final String filepath = "E:\\Training\\Movie.txt";
	
	public MovieManager() throws ClassNotFoundException {
		movies = new ArrayList<Movie>();
		try {
			loadMovies();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addMovie(Movie movie)
	{
		movies.add(movie);
	}
	
	public void clearMovies()
	{
		movies.clear();
	}
	
	public List<Movie> getMovies()
	{
		return movies;
	}
	
	public int getMovieId()
	{
		return movies.size()+1;
	}
	
	public void loadMovies() throws IOException, ClassNotFoundException {
		FileInputStream filein = new FileInputStream(filepath);
		ObjectInputStream objectin = new ObjectInputStream(filein);
		movies = (ArrayList<Movie>) objectin.readObject();
	}
	
	public void saveMovies() throws IOException
	{
		FileOutputStream fileout = new FileOutputStream(filepath);
		ObjectOutputStream objectout = new ObjectOutputStream(fileout);
		objectout.writeObject(movies);
	}
	
	public void deleteAllMovies()
	{
		movies.clear();
	}
	
	public Movie getMovieById(int id)
	{
		for(Movie movie : movies)
		{
			if(movie.getId() == id)
			{
				return movie;
			}
		}
		return null;
	}
	
	public void deleteMovies(int movieId)
	{
		for(Movie movie : movies)
		{
			if(movie.getId() == movieId)
			{
				movies.remove(movie);
				System.out.println("Movie Deleted Successfully");
				break;
			}
		}
	}
	
}
