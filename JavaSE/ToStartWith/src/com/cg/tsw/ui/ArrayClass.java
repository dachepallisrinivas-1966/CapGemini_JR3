package com.cg.tsw.ui;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int [] arr1 = {10,20,30,40,50};
	    int [] arr2 = arr1;             // valid 
	    System.out.println(arr1);       // values are not displayed. reference is displayed.
	    System.out.println(arr2);

	    for(int i = 0; i < 5; i++) {
	        arr1[i]++;
	    }

	    for(int val : arr1) {
	        System.out.println(val);
	    }                               // 11,21,31,41,51

	    for(int val : arr2) {
	        System.out.println(val);    // 11,21,31,41,51
	    }
	    
	    int [] arr3 = Arrays.copyOf(arr1, arr1.length);
	    for(int val : arr3) {
	    	System.out.println(val);
	    }
	    System.out.println("-----------------------------------------");
	    
	    for(int i = 0; i < 5; i++) {
	        arr1[i]++;
	    }
	    
	    for(int val : arr3) {
	    	System.out.println(val);
	    }
	    System.out.println("------------------------------");
	    
	    for(int val : arr1) {
	    	System.out.println(val);
	    }
	    System.out.println("------------------------------");
	    
	    int [] arr4 = {50,40,10,30,20};
	    for(int val : arr4) {
	    	System.out.println(val);
	    }
	    System.out.println("------------------------------");
	    
	    int [] arr5 = {10,20,30,40,50};
	    int [] arr6 = {10,20,30,40,50};
	    
	    if (arr5 == arr6) {
	    	System.out.println("they are equal");
	    } else {
	    	System.out.println("they are not equal");
	    }
	    
	    System.out.println(Arrays.equals(arr5, arr6) == true ? "equal" : "not equal");
	    
	    	
	    int [] arr7 = arr6;
	    if (arr6 == arr7) {
	    	System.out.println("they are equal");
	    } else {
	    	System.out.println("they are not equal");
	    }
	    
	    System.out.println("------------------------------");
	    
	    int[][] darr = {
	    		{40,50,60},
	    		{10,20,30}
	    };
	    
	    int[][] darr2 = {
	    		{40,50,60},
	    		{10,20,30}
	    };
	    
	    System.out.println(Arrays.deepEquals(darr, darr2) ? "equal" : "not equal"); 
	    
//	    for(int [] row : darr) {
//	    	for(int data : row) {
//	    		System.out.print(data + "\t");
//	    	}
//	    	System.out.println();
//	    }
	    
	
	}

}
