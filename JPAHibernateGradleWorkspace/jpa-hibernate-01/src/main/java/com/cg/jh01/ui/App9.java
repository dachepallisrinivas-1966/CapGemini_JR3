package com.cg.jh01.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee2;
import com.cg.jh01.model.Address;
import com.cg.jh02.util.JPAUtil;

public class App9 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		
		Employee2 emp1 = new Employee2(101L, "Srinivas", 150000.0, LocalDate.now(), new Address("1-1-1", "street-A", "530001"));
		Employee2 emp2 = new Employee2(102L, "Deepa", 160000.0, LocalDate.now(), new Address("2-2-2", "street-B", "630001"));
		Employee2 emp3 = new Employee2(103L, "Raghu Nandan", 170000.0, LocalDate.now(), new Address("3-3-3", "street-C", "730001"));
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		
		txn.commit();
		
		em.close();
	}

}
