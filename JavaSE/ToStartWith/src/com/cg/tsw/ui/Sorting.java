package com.cg.tsw.ui;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no. of cells : ");
		int num = scan.nextInt();
		
		int [] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Enter value : ");
			arr[i] = scan.nextInt();
		}
		
		int i, j, temp;
		for(i = 0; i <= num - 2; i++) {
			for(j = i+1; j <= num-1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array ...");
		
		for(int data : arr) {
			System.out.println(data);
		}
		
		scan.close();

	}

}
