package com.cg.oopd.model;

public class ComplexNumber {
	/* data members (or) fields */
	private double realPart;		// represent real part of the complex number
	private double imaginaryPart;	// represent imaginary part 
	
	/* default constructor */
	public ComplexNumber() {
		realPart = -1;
		imaginaryPart = -1;
		// System.out.println("default constructor is called ");
	}
	
	/* parameter constructor */
	public ComplexNumber(double realPart) {
		this.realPart = realPart;
		this.imaginaryPart = 0;
		// System.out.println("one-parameter constructor is called ");
	}
	
	/* parameter constructor */
	public ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
		// System.out.println("two-parameter constructor is called ");
	}
	
	/* copy constructor */
	public ComplexNumber(ComplexNumber other) {
		this.realPart = other.realPart;
		this.imaginaryPart = other.imaginaryPart;
	}
	
	/* setters and getters */
	
	// modify real part
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	
	// modify imaginary part
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	// to retrieve real part
	public double getRealPart() {		
		return realPart;
	}
	
	// to retrieve imaginary part
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	
//	public ComplexNumber add(ComplexNumber other) {
//		ComplexNumber result = new ComplexNumber();
//		result.realPart = this.realPart + other.realPart;
//		result.imaginaryPart = this.imaginaryPart + other.imaginaryPart;
//		return result;
//	}
//	
//	public ComplexNumber diff(ComplexNumber other) {
//		ComplexNumber result = new ComplexNumber();
//		result.realPart = this.realPart - other.realPart;
//		result.imaginaryPart = this.imaginaryPart - other.imaginaryPart;
//		return result;
//	}
	
	public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
		ComplexNumber result = new ComplexNumber();
		result.realPart = first.realPart + second.realPart;
		result.imaginaryPart = first.imaginaryPart + second.imaginaryPart;
		return result;
	}
	
	public static ComplexNumber diff(ComplexNumber first, ComplexNumber second) {
		ComplexNumber result = new ComplexNumber();
		result.realPart = first.realPart - second.realPart;
		result.imaginaryPart = first.imaginaryPart - second.imaginaryPart;
		return result;
	}
	
	
	
	
}

