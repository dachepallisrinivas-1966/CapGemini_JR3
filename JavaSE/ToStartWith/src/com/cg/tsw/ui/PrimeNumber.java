package com.cg.tsw.ui;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		
		boolean isPrime = true;
		for(int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is composite number");
		}
		
		scan.close();
	}

}


	
