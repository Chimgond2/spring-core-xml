package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mySpring.xml");
		Employee employee=(Employee)applicationContext.getBean("emp");
		employee.details();
	}

}
