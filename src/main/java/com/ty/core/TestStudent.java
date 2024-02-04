package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mySpring.xml");
	Student student=(Student)applicationContext.getBean("stud");
	student.detail();
	
	}

}
