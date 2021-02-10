package com.cg.tsw.ui;

import java.util.Scanner;

public class FunctionDemo {

	/*
	 * function definition:
	 * name : simpleInterest
	 * params : principle - amount taken
	 * 			time - no. of months
	 * 			rate - date of interest
	 * returns : simple interest
	 * purpose : calculates simple interest
	 */
	static double simpleInterest(int principle, int time, int rate) {		// formal parameters
		double simple;
		simple = principle * time * rate / 100.0;
		return simple;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter principle : ");
		int principle = scan.nextInt();
		System.out.print("Enter time : ");
		int time = scan.nextInt();
		System.out.print("Enter rate : ");
		int rate = scan.nextInt();
		
		double simpleInterest = simpleInterest(principle,time,rate);	// function call - actual parameters
		
		System.out.println("Simple Interest : " + simpleInterest);
		
		scan.close();
	}

}
