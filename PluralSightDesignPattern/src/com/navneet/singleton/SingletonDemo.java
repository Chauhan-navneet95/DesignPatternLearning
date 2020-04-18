package com.navneet.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		DbSingleton dbSingleton1 =DbSingleton.getDbSingletonInstance();
		
		DbSingleton dbSingleton2 =DbSingleton.getDbSingletonInstance();
		boolean IsSame=(dbSingleton1==dbSingleton2);
		
		System.out.println("Are these same instance :"+IsSame);

	}

}
