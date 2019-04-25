package org.avoiding_escaping_reference.bean;

import org.avoiding_escaping_reference.bean.Price;

public class Book implements BookInterface {
	private int id;
	private String title;
	private String author;
	private Price price;

	//int, String are immutable. So no issues.
	/* (non-Javadoc)
	 * @see com.avoidingreference.bean.BookInterface#getId()
	 */
	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.avoidingreference.bean.BookInterface#getTitle()
	 */
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see com.avoidingreference.bean.BookInterface#getAuthor()
	 */
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}

	/* (non-Javadoc)
	 * @see com.avoidingreference.bean.BookInterface#toString()
	 */
	public String toString() {
		return title + " by " + author;
	}
	
	//Need to check the escape reference
	/* (non-Javadoc)
	 * @see com.avoidingreference.bean.BookInterface#getPrice()
	 */
	public Price getPrice() {
		return this.price;
	}

	// Book is not a immutable object. If we get a reference to it, we can alter the
	// price using below method
	public void setPrice(Double price) {
		this.price = new Price(price);
	}

}
