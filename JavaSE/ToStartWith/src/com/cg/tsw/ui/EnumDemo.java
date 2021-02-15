package com.cg.tsw.ui;

import java.util.Scanner;

public class EnumDemo {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		
		System.out.println("Choice\tMenu Item");
		System.out.println("===========================");
		for (ArithmeticOperation op : ArithmeticOperation.values()) {
			System.out.println(op.ordinal() + "\t" + op.name());
		}
		System.out.println("Enter operation : ");
		int choice = scan.nextInt();
		ArithmeticOperation menu = ArithmeticOperation.values()[choice];
				
	
		switch (menu) {
			case ADDITION : System.out.println(firstNumber + secondNumber);
						break;
			case DIFFERENCE : System.out.println(firstNumber - secondNumber);
						break;
			case MULTIPLY: System.out.println(firstNumber * secondNumber);
						break;
			case DIVISION : System.out.println(firstNumber / secondNumber);
						break;
		}
		scan.close();
	}
}
