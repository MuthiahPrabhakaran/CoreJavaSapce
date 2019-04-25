package org.escaping_reference.bean;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}

	//Immutable - no issues
	public Double convert(String toCurrency) {
		
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			//Appear to be mutating the value
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			value = conversion * value;
			return value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}
	
	//Escaping refernce
	//Either change it into unmodifiable map or send the rate(Double type) alone.
	public Map<String,Double> getRates() {
		return rates;
	}
	
}
