package com.ty.core;

public class Computer {
	String name;
	double cost;
	int id;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void details() {
		System.out.println("name is: "+name);
		System.out.println("cost is: "+cost);
		System.out.println("id is: "+id);


	}
	
	
	

}
