package com.ty.core;

public class Employee {
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void details() {
		System.out.println("name is: "+name);
		System.out.println("id is: "+id);

	}
	

}
