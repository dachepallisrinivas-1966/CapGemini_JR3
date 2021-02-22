package com.cg.tddd.excep;

public class ZeroNotAllowedException extends Exception {
	public ZeroNotAllowedException() {
		super("zero is not allowed for division");
	}
}
