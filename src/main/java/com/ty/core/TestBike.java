package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring2.xml");
		Bike bike = (Bike) applicationContext.getBean("bike");
		bike.engine.on();
	}

}
