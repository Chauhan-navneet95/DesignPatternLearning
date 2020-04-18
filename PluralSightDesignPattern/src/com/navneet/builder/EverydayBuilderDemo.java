package com.navneet.builder;

public class EverydayBuilderDemo {

	public static void main(String[] args) {
		StringBuilder builder= new StringBuilder();
		builder.append("This is first String");
		builder.append("Second line of text");
		builder.append("Third line of text");
		builder.append("Fourth line of text");
		builder.append("Fifth line of text");
		
		System.out.println(builder.toString());

	}

}
