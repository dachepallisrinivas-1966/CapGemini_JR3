package com.cg.tsw.ui;

import java.util.Scanner;

class Factorial {
    public static void main(String [] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();
        
        int fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        
        System.out.println("Factorial : " + fact);
        scan.close();
    }
}