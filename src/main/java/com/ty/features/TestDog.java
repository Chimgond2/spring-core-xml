package com.ty.features;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestDog {
	public static void main(String[] args) {

		ClassPathResource classPathResource = new ClassPathResource("myfeature.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Dog dog1=(Dog)beanFactory.getBean("dog");
		Dog dog2=(Dog)beanFactory.getBean("dog");
		System.out.println(dog1);
		System.out.println(dog2);

	}
}