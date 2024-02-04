package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring2.xml");
	Person person=(Person)applicationContext.getBean("myperson");
	person.pan.display();
	person.eat();
	person.walk();
	
	System.out.println("person id is: "+person.id);
	System.out.println("person name is: "+person.name);

	}
}
