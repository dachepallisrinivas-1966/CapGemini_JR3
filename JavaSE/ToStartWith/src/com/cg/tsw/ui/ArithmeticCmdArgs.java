package com.cg.tsw.ui;

public class ArithmeticCmdArgs {

	public static void main(String[] args) {

//		int firstNumber = Integer.parseInt(args[0]);
//		int secondNumber = Integer.parseInt(args[1]);

		if (args.length != 3) {
			System.out.println(
					"Insufficient inputs, you must give two numbes and arithmetic operation as command-line arguments");
			System.exit(0);
		}

		double firstNumber = Double.parseDouble(args[0]);
		double secondNumber = Double.parseDouble(args[1]);

		String operation = args[2];

		switch (operation) {
		case "ADD":
			System.out.println("Sum : " + (firstNumber + secondNumber));
			break;
		case "SUB":
			System.out.println("Difference : " + (firstNumber - secondNumber));
			break;
		}

	}

}
