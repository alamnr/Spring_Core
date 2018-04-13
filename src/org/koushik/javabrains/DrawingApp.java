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
		
		/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/*Shape triangle = (Shape)context.getBean("triangle");
		triangle.draw();*/
		
		Shape circle = (Shape)context.getBean("circle");
		circle.draw();
		
		//System.out.println(context.getMessage("greeting",null,"Deafault Greeting", null));
		//System.out.println(context.getMessage("greeting",null,"Deafault Greeting", new Locale("BN")));
		
	}

}
