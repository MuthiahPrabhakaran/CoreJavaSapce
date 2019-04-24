package com.reference.bean;

import com.avoidingreference.bean.Price;

public class Book {
	private int id;
	private String title;
	private String author;
	private Price price;

	//int, String are immutable. So no issues.
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}

	public String toString() {
		return title + " by " + author;
	}
	
	//Need to check the escape reference
	public Price getPrice() {
		return this.price;
	}

	// Book is not a immutable object. If we get a reference to it, we can alter the
	// price using below method
	public void setPrice(Double price) {
		this.price = new Price(price);
	}

}
