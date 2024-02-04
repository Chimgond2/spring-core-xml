package com.ty.core;

public class Pan {
	int number;
	String country;
	
	
	public Pan(int number, String country) {
		
		this.number = number;
		this.country = country;
	}


	public void display() {
		System.out.println(" pan  no is: "+number);
		System.out.println(" pan country is : "+country);

	}

}
