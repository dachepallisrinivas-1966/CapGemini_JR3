package com.cg.tsw.ui;

public class JaggedArray {

	public static void main(String [] args) {
		int [][] jarr = {
			    {1,2},
			    {3,4,5},
			    {6,7,8,9},
			    {10}
		};
		
		int i, j;
		for(i=0; i< jarr.length; i++) {
			for(j=0; j<jarr[i].length; j++) {
				System.out.print(jarr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
		
		for(int [] row : jarr) {
			for(int val : row) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}
	}

}
