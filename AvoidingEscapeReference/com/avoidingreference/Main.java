package com.avoidingreference;

import com.reference.BookCollection;

public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
		bc.printAllBooks();
		
		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));

		bc.printAllBooks();
		
		//Before and after the sysout bc should hold the same value. But some method is altering the data.
	}
}
