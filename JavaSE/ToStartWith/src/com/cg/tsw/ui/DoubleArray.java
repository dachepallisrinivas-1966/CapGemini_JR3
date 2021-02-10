package com.cg.tsw.ui;

public class DoubleArray {

	public static void main(String[] args) {
		
		int [][] studentData = {
				{1, 25, 150, 60},
		        {2, 21, 160, 45},
		        {3, 19, 140, 36}
		};
		int i, j;
		System.out.println("Rollno\tAge\tHeight\tWeight");
		System.out.println("-----------------------------------------------------");
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				System.out.print(studentData[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		

	}

}
