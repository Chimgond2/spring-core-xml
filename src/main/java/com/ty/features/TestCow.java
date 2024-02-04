package com.ty.features;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCow {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("myfeature.xml");
		Cow cow1=(Cow)applicationContext.getBean("cow");
		Cow cow2=(Cow)applicationContext.getBean("cow");
		System.out.println(cow1);
		System.out.println(cow2);
		applicationContext.destroy();

	}
}