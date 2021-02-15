package com.cg.oopd.model;

public class Account {
	private long accNumber;
	private String fullName;
	private double balance;
	
	
	public Account() {
		/*default constructor */
	}


	public Account(long accNumber, String fullName, double balance) {
		super();
		this.accNumber = accNumber;
		this.fullName = fullName;
		this.balance = balance;
	}


	public long getAccNumber() {
		return accNumber;
	}


	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public double getBalance() {
		return balance;
	}


	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (balance - amount >= 1000) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Funds - Operation Cancelled");
		}
	}
	
	public void fundTransfer(Account toAccount, double amount) {
		if (this.balance - amount >= 1000) {
			this.balance -= amount;
			toAccount.balance += amount;
		} else {
			System.out.println("Cannot Transfer Due to Lack of funds");
		}
	}
	
	
	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", fullName=" + fullName + ", balance=" + balance + "]";
	}

	
}
