package com.cg.iad.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.iad.config.MyConfig;
import com.cg.iad.service.IGreetService;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		IGreetService gs = context.getBean("gsa", IGreetService.class);
		System.out.println(gs.getGreeting("Srinivas"));
		
		((AbstractApplicationContext) context).close();

	}

}
