package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComputer {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mySpring.xml");
	Computer computer=(Computer)applicationContext.getBean("com");
	computer.details();
	}

}
