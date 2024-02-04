package com.ty.core;

public class Student {
	String name;
	double percentage;
	public Student(String name, double percentage) {
		
		this.name = name;
		this.percentage = percentage;
	}
	public void detail() {
		System.out.println("name is : "+name);
		System.out.println("percentage is : "+percentage);

	}
	
	

}
