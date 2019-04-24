package com.avoidingreference.bean;

import com.reference.bean.Price;

public interface BookInterface {

	//int, String are immutable. So no issues.
	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	//Need to check the escape reference
	Price getPrice();

}