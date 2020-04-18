package com.navneet.singleton;

public class EveryDaySingletonDemo {

	public static void main(String[] args) {
		Runtime singletonRuntime= Runtime.getRuntime();
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		System.out.println(anotherInstance);
		
		if(singletonRuntime==anotherInstance) {
			System.out.println("Both Instance are same");
		}

	}

}
