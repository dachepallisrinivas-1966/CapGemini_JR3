package com.cg.iad.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.iad.config.MyConfig;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		System.out.println(context.getBean("current"));
		
		((AbstractApplicationContext) context).close();

	}

}
