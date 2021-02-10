package com.cg.tsw.ui;

public class CallByDemo {

	static void changeInt(int x) {
		x++;
	}
	
	static void changeDouble(double x) {
		x++;
	}
	
	static void changeString(String x) {
		x = "modified";
	}
	
	static void changeArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
	
	public static void main(String[] args) {
		int a = 10;
		changeInt(a);
		System.out.println(a);
		
		double b = 10.5;
		changeDouble(b);
		System.out.println(b);
		
//		String str = "srinivas";
//		changeString(str);
//		System.out.println(str);
		
		int [] ar = {10,20,30,40,50};
		changeArray(ar);
		for(int data : ar ) {
			System.out.println(data);
		}

	}

}
