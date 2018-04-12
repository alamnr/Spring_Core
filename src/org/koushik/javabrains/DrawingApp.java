package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		Triangle triangle1 = (Triangle)context.getBean("triangle");
		
		// Default bean scope is singleton bean is created once when applicationContext is initialised. Only once per spring container
		// prototype scope creates new bean each time when getBean()  method is called not when applicationContext is initialised - lazy initialisation
		// Web-aware context bean scope
		// Request scope- new bean per servlet request
		// Session scope - New bean per session
		// Global Session - New bean per global HTTP session (portlet context) 
		System.out.println(triangle.toString());
		System.out.println(triangle1.toString());
		
		System.out.println(triangle==triangle1);

	}

}
