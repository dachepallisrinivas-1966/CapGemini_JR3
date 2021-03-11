package com.cg.ixd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ixd.service.GreetServiceImpl;
import com.cg.ixd.service.IGreetService;

public class App1 {

	public static void main(String[] args) {
		// never use directly sub class to create object - not recommended
		GreetServiceImpl gs1 = new GreetServiceImpl();
		System.out.println(gs1.getGreeting("Srinivas"));
		
		// program-to-interface method - always recommended
		IGreetService gs2 = new GreetServiceImpl();
		System.out.println(gs2.getGreeting("Srinivas"));
		
		
		// Spring Container - IoC - Spring way
		// ClassPath means src/main
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		
		IGreetService gs3 = (IGreetService)context.getBean("gsBean");
		System.out.println(gs3.getGreeting("Srinivas"));
		
		System.out.println("----------------------------------------------------------------------------");
		
		// Property Injection (Setter Injection) - setter must be there in the implementation class.
		IGreetService gs4 = (IGreetService)context.getBean("gsaBean");
		System.out.println(gs4.hashCode());
		System.out.println(gs4.getGreeting("Srinivas"));
		
		
		IGreetService gs5 = (IGreetService)context.getBean("gsaBean");
		System.out.println(gs5.hashCode());
		System.out.println(gs5.getGreeting("Ramesh"));
		
		System.out.println("----------------------------------------------------------------------------");
		
		// Constructor Injection - constructor must be available
		
		IGreetService gs6 = (IGreetService)context.getBean("gsaBean2");
		System.out.println(gs6.hashCode());
		System.out.println(gs6.getGreeting("Srinivas"));
		
		// Constructor Injection - constructor must be available
		
		IGreetService gs7 = (IGreetService)context.getBean("gsaBean3");
		System.out.println(gs7.hashCode());
		System.out.println(gs7.getGreeting("Srinivas"));
		
		System.out.println("----------------------------------------------------------------------------");
		
		IGreetService gsadv = (IGreetService) context.getBean("gsadvBean");
		System.out.println(gsadv.getGreeting("Srinivas"));
		
		
		((AbstractApplicationContext) context).close();
	}

}
