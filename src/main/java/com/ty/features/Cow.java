package com.ty.features;

public class Cow {
	static {
		System.out.println("load in cow memory");
	}
	{
		System.out.println("creating object of cow");
	}
	void m1() {
		System.out.println("based on sufi demand of cow");
	}

}
