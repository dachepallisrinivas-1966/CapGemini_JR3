package com.cg.tsw.ui;

public class cmdArgs {

	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("------------------------------------");
		
		for(String data : args) {
			System.out.println(data);
		}

	}

}
