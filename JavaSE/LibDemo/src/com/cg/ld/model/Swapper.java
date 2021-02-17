package com.cg.ld.model;


public class Swapper<T> {
	
	public void doSwap(T a, T b) {
		System.out.println("Before Swap : a = " + a + "\t" + "b = " + b);
		T t = a;
		a = b;
		b = t;
		System.out.println("After Swap : a = " + a + "\t" + "b = " + b);
	}

}
