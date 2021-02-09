package com.cg.tsw.ui;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice, num1, num2;
		
		do {
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("0. Exit");
			System.out.println("Enter choice : ");
			choice = scan.nextInt();
			
			if (choice == 0) {
				System.out.println("Thank you.");
				break;
			}
			
			if (choice < 1 || choice > 4) {
				System.out.println("Invalid choice");
				continue;
			}
			
			System.out.println("Enter first number : ");
			num1 = scan.nextInt();
			System.out.println("Enter second number : ");
			num2 = scan.nextInt();
			
			switch (choice) {
			case 1 : System.out.println("Sum : " + (num1+num2));
					break;
			case 2 : System.out.println("Difference : " + (num1-num2));
					break;
			case 3 : System.out.println("Product : " + (num1*num2));
					break;
			case 4 : System.out.println("Quotient : " + (num1 / num2));
					break;			
					
			}
		} while (choice != 0);

		
		scan.close();

	}

}
