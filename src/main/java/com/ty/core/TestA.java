package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mySpring.xml");
	Pen pen	=(Pen)applicationContext.getBean("ok");
pen.oops();
	}

}
