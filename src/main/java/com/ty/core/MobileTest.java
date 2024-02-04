package com.ty.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileTest {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("mySpring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	Mobile mobile=(Mobile)beanFactory.getBean("mymobile");
	mobile.mobile();
	}

}
