package com.arun.interviewquedtions;

public class OverRiding {

	/*
	 * Rules for Overriding 1. method Signature should be same, which means the
	 * return type should also be same 2. overiding method cannot be less
	 * restrictive than overridden method 3. overiding method cannot throw
	 * exception higher in hierarchy than overridden method 4. final, static and
	 * private method cannot be overridden, final will give a compliation error
	 * and static and private will mean method hiding
	 */
	public static void main(String[] args) {
		Shape s = new Red();
		System.out.println(s.color()); // will give red color
		s = new Green();
		System.out.println(s.color());

		Animal a = new Rhino();
		a.makeSound(); // o/p will be "Animal making a sound", it wont call subclass method
	}
}

abstract class Shape {
	protected abstract String color();
}

class Red extends Shape {
	/*
	 * 2. color method cannot be private or default, it can be protected, public
	 */
	@Override
	public String color() {
		return "Red";
	}
}

class Green extends Shape {
	@Override
	protected String color() {
		return "Green";
	}
}

class Animal {
	public static void makeSound() {
		System.out.println("Animal making a sound");
	}
}

class Rhino extends Animal {
	public static void makeSound() {
		System.out.println("Rhino making a sound");
	}
}
