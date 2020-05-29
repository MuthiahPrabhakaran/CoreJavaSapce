package com.dp.cdp.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie)registry.createItem("Movie");
		movie.setTitle("Avengers Infinity War");
		
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		System.out.println(movie.getRunTime());
		System.out.println(movie);
		
		Movie anotherMovie = (Movie)registry.createItem("Movie");
		anotherMovie.setTitle("Doctor Strange");
		
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getPrice());
		System.out.println(anotherMovie);
	}

}
