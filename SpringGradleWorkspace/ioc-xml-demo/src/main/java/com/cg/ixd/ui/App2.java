package com.cg.ixd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ixd.service.Dummy;

public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		

		Dummy copy1 = context.getBean("dummy", Dummy.class);
		System.out.println(copy1.getCounter());
		System.out.println(context.isSingleton("dummy"));
		System.out.println(context.isPrototype("dummy"));
				
		Dummy copy2 = context.getBean("dummy", Dummy.class);
		System.out.println(copy2.getCounter());
		
		Dummy copy3 = context.getBean("dummy", Dummy.class);
		System.out.println(copy3.getCounter());
		
		((AbstractApplicationContext) context).close();
	}

}
