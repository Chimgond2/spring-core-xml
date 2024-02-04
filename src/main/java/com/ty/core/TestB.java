package com.ty.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestB {
public static void main(String[] args) {
	ClassPathResource classPathResource=new ClassPathResource("mySpring.xml");
	 BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	Pen pen=(Pen) beanFactory.getBean("ok");
	pen.oops();
}
}
