package com.cg.ld.ui;

import com.cg.ld.model.Swapper;

public class GenericApp {

	public static void main(String[] args) {
		// till jdk 1.7
//		Swapper<Integer> iObj = new Swapper<Integer>();
//		iObj.doSwap(new Integer(10), new Integer(20));
//		
//		Swapper<Double> dObj = new Swapper<Double>();
//		dObj.doSwap(new Double(1.5), new Double(2.3));
		
		// jdk 1.8 - Type Inference
		Swapper<Integer> iObj2 = new Swapper<>();
		iObj2.doSwap(10, 20);		// auto-boxing - jdk 1.5
		
		Swapper<Double> dObj2 = new Swapper<>();
		dObj2.doSwap(2.5, 3.9); 	// auto-boxing

	}

}
