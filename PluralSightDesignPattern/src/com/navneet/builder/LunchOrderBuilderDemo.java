package com.navneet.builder;

public class LunchOrderBuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder=new LunchOrder.Builder();
		builder.bread("Wheat").condiment("lettuce").dressing("Mustard").meat("ham");
		 
		LunchOrder lunchOrder= builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiment());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());

	}

}
