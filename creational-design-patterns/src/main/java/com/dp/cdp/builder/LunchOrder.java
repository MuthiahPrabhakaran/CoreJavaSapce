package com.dp.cdp.builder;

public class LunchOrder {

	private String bread;
	private String condiments;
	private String meat;
	private String dressing;

	public static class Builder {

		private String bread;
		private String condiments;
		private String meat;
		private String dressing;

		public Builder() { // We can use some parameters if some variables are mandatory in all cases
		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
	}

	public LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.meat = builder.meat;
		this.dressing = builder.dressing;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getMeat() {
		return meat;
	}

	public String getDressing() {
		return dressing;
	}

}
