package com.cg.jh05.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App1 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Employee e1 = new Employee(101L, "Srinivas", "Dachepalli", 40000.0, 10);
		Employee e2 = new Employee(102L, "Priya", "Vadlamani", 50000.0, 20);
		Employee e3 = new Employee(103L, "Geetha", "Addepalli", 45000.0, 10);
		Employee e4 = new Employee(104L, "Sahiti", "Vemuri", 42000.0, 20);
		Employee e5 = new Employee(105L, "Pallavi", "Aripaka", 49000.0, 10);
		Employee e6 = new Employee(106L, "Vamsy", "Yalamanchili", 540000.0, 20);
		Employee e7 = new Employee(107L, "Sundari", "Kolluru", 53000.0, 10);
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.persist(e5);
		em.persist(e6);
		em.persist(e7);
		txn.commit();
				
		JPAUtil.shutdown();

	}

}
