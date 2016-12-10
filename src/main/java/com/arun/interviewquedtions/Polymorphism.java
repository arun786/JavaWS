package com.arun.interviewquedtions;

public class Polymorphism {
	public static void main(String[] args) {

		/*
		 * Polymorphism is an oops concept where interface is preferred instead
		 * of concrete Implementation It is of two types overloading and
		 * overriding, below is an example of overriding
		 */

		APoly a = new APoly();
		a.description();

		APoly b = new BPoly();
		b.description();

	}

}

class APoly {
	public void description() {
		System.out.println("This is " + this.getClass().getName());
	}
}

class BPoly extends APoly {

	@Override
	public void description() {
		System.out.println("This is " + this.getClass().getName());
	}

}