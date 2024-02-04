package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mySpring.xml");
	Mobile mobile=(Mobile)applicationContext.getBean("mymobile");
	System.out.println(mobile.cost);
	System.out.println(mobile.name);
	mobile.mobile();

	}

}
