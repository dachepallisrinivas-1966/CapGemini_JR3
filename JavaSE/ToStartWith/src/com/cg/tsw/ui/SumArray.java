package com.cg.tsw.ui;

public class SumArray {

//	static int sum(int[] arr) {
//		int sum = 0;
//		for(int data : arr) {
//			sum += data;
//		}
//		return sum;
//	}
	
	static int sum(int ... arr) {
		int sum = 0;
		for(int data : arr) {
			sum += data;
		}
		return sum;
	}
	
	public static void main(String[] args) {
	
//		System.out.println(sum(new int[] {10,20}));
//		System.out.println(sum(new int[] {30,40,50,60}));
//		System.out.println(sum(new int[] {10}));
		
		System.out.println(sum(10,20));
		System.out.println(sum(30,40,50,60));
		System.out.println(sum(10));
	}

}
