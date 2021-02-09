package com.cg.tsw.ui;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter no. of rows : ");
		int n = scan.nextInt();
		
		int i, j, s;
		
		for(i=1; i<=n; i++) {
			for(s=1; s<=i-1;s++) {
				System.out.print("\t");
			}
			for(j=1; j<=n-i+1; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
