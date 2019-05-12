package com.dp.cdp.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<>();
	
	Registry(){
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item)items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("new Movie");
		movie.setRunTime("2 hours");
		movie.setPrice(24.99);
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setTitle("new book");
		book.setPrice(15.00);
		book.setNumberOfPages(145);
		items.put("Book", book);
	}
}
