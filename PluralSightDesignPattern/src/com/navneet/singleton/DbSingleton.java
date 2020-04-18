package com.navneet.singleton;

public class DbSingleton {
	private static volatile DbSingleton instance= null;
	
	private DbSingleton() {
		//Stop refelction to create a instance
		if(instance!=null) {
			throw new RuntimeException("Use getDbSingletonInstance() method to create instance");
		}
		
	}
	public static DbSingleton getDbSingletonInstance() {
		if(instance==null) {
			synchronized(DbSingleton.class) {
				if(instance==null) {
					instance = new DbSingleton();
					return instance;
					}
				else {
					return instance;
				}
			}
		}
		else {
			return instance;
		}
	}
}
