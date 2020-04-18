package com.navneet.builder;

public class LunchOrderTele {
	private String bread;
	private String condiment;
	private String dressing;
	private String meat;
	//telescoping constructors ahead
	public LunchOrderTele(String bread) {
		this.bread=bread;
		
	}
	public LunchOrderTele(String bread,String condiment) {
		this(bread);
		this.condiment=condiment;
	}
	public LunchOrderTele(String bread,String condiment,String dressing) {
		this(bread,condiment);
		this.dressing=dressing;
	}
	public LunchOrderTele(String bread,String condiment,String dressing,String meat) {
		this(bread,condiment,dressing);
		this.meat=meat;
	}
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
