package org.keith.demo.dubbo.registry.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		new ClassPathXmlApplicationContext("AC.xml");
		
		System.out.println("System boot already!");
		while (true) {  
			System.out.print(".");
			Thread.sleep(1000);
        }
	}
}
