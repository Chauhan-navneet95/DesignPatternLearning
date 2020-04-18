package com.navneet.factory;

import java.util.Calendar;

public class FactoryEvrudayDemo {
	public static void main(String[] args) {
		// here we dont know what calendar instanc is going to return
		
		Calendar cal = Calendar.getInstance();
		
		
		//Calendar cal= Calendar.getInstance();
		
		
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
