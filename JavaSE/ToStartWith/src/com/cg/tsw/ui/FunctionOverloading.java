package com.cg.tsw.ui;

public class FunctionOverloading {

	static int area(int len, int bre) {
		return len*bre;
	}
	
	static double area(int radius) {
		return Math.PI*radius*radius;
	}
	
	public static void main(String[] args) {
		System.out.println("Area of 3 x 4 rectangle : " + area(3,4));
		System.out.printf("Area of 2 unit circle : %.1f", area(2));
	}

}
