package com.cg.tsw.ui;

import java.util.Scanner;

public class BigSmall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int big = Integer.MIN_VALUE, small = Integer.MAX_VALUE, num;
		
		while (true) {
			System.out.print("Enter number [0 to stop] : ");
			num = scan.nextInt();
			
			if (num == 0) {
				break;
			}
			
			if (num > big) {
				big = num;
			}
			
			if (num < small) {
				small = num;
			}
		}
		
		System.out.println("Big : = " + big + "\t" + "Small : " + small);
		scan.close();

	}

}
