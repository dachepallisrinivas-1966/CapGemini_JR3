package com.cg.jh01.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee;
import com.cg.jh02.util.JPAUtil;

public class App1 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		
		Employee emp1 = new Employee(101L, "Srinivas", 150000.0, LocalDate.now());
		Employee emp2 = new Employee(102L, "Deepa", 160000.0, LocalDate.now());
		Employee emp3 = new Employee(103L, "Raghu Nandan", 170000.0, LocalDate.now());
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		
		txn.commit();
		
		em.close();
	}

}
