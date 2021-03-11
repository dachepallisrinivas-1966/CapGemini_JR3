package com.cg.jh01.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Product;
import com.cg.jh01.util.JPAUtil;

public class App8 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Product prod1 = new Product("mouse");
		Product prod2 = new Product("web cam");
		Product prod3 = new Product("key board");
		
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(prod1);
		em.persist(prod2);
		em.persist(prod3);
		
		txn.commit();
		
		em.close();
	}

}
