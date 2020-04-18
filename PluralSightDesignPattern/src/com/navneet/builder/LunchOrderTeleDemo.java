package com.navneet.builder;

public class LunchOrderTeleDemo {
	public static void main(String args[]) {
		
		LunchOrderTele lunchOrderTele= new LunchOrderTele("Wheat","Lettuce","Ham","Mustard");
		//this approach makes the object immutable, Since no setters methods are available, 
		//but this also makes it rigid , as what if the order has only bread and meat and User don't want to pass null 
		//then in this situation we need one more constructor that only has bread and meat , but that is not possible since all parametrs are String
		//constructor overloading will not work
	}

}
