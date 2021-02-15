package com.cg.oopd.ui;

import com.cg.oopd.model.Account;

public class AccountApp {

	public static void main(String[] args) {
		Account first = new Account(101, "Srinivas", 10000);
		Account second = new Account(102, "Karan Thapa", 50000);
		
		System.out.println(first);
		System.out.println(second);
		
		first.deposit(1500);
		System.out.println(first);
		
		second.withdraw(4500);
		System.out.println(second);
		
		first.fundTransfer(second, 5000);
		System.out.println(first);
		System.out.println(second);

	}

}
