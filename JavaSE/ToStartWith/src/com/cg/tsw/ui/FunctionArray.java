package com.cg.tsw.ui;

public class FunctionArray {
	
	//	[1,2,3,4,5]
	//	n = 5
	//	a[i]		a[n-i-1]
	//	0		 4
	//	1		 3
	//	2		 2
	
	static int[] reverseArray(int[] arr) {
		int len = arr.length;
		int temp;
		for(int i = 0; i < len/2; i++) {
			temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = temp;
		}
		return arr;
	}
	

	public static void main(String[] args) {
		int [] a = {10,20,30,40,50};
		int [] result = reverseArray(a);
		for(int data : result) {
			System.out.println(data);
		}
		

	}

}
