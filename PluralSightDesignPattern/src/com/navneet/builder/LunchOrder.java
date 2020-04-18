package com.navneet.builder;

public class LunchOrder {
	
	public static class Builder{
		private String bread;
		private String condiment;
		private String dressing;
		private String meat;
		// a no arg constructor
		public Builder() {
			
		}
		
		//implement the actual builder
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		//a few methods
		public Builder bread(String bread) {
			this.bread=bread;
			return this;
			// it return a instance of builder with bread field set
		}
		public Builder condiment(String condiment) {
			this.condiment=condiment;
			return this;
			// it return a instance of builder with condiment field set
		}
		public Builder dressing(String dressing) {
			this.dressing=dressing;
			return this;
			// it return a instance of builder with dressing field set
		}
		public Builder meat(String meat) {
			this.meat=meat;
			return this;
			// it return a instance of builder with meat field set
		}
		
	}
	
	private final String bread;
	private  final String condiment;
	private final String dressing;
	private final  String meat;
	
	//private constructor
	private LunchOrder(Builder builder){
		this.bread=builder.bread;
		this.condiment=builder.condiment;
		this.dressing=builder.dressing;
		this.meat=builder.meat;
	}
	//getters
	public String getCondiment() {
		return condiment;
	}
	public String getBread() {
		return bread;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}

}
