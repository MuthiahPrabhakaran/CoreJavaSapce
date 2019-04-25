package org.avoiding_escaping_reference.bean;

import org.avoiding_escaping_reference.bean.Price;

public interface BookInterface {

	//int, String are immutable. So no issues.
	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	//Need to check the escape reference
	Price getPrice();

}