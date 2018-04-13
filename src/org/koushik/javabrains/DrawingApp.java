package org.koushik.javabrains;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape circle = (Shape)context.getBean("circle");
		circle.draw();
		
		
	}

}
