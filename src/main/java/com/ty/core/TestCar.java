package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring2.xml");
	
	Car car=(Car)applicationContext.getBean("mycar");
	car.musicSystem.play();
	}

}
