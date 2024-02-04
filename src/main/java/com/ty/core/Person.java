package com.ty.core;

public class Person {
	int id;
	String name;
	Pan pan;

	public void eat() {
		System.out.println("im eating");
		
	}

	public void walk() {
		System.out.println("im walking");
	}

	public Person(int id, String name, Pan pan) {
		
		this.id = id;
		this.name = name;
		this.pan = pan;
	}
	

}
