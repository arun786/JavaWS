package com.arun.interviewquedtions;

public class OverLoaded {

	/*
	 * overloading in java occurs when methods in the same class or subclass
	 * shares same name with difference in number of arguments or difference in
	 * type of arguments, return type not included, it is also called as static
	 * binding because the compiler checks method overloading at compile time
	 * and because of this it is faster
	 */

	public static void main(String[] args) {

	}

	public void getDescription() {

	}

	public void getDescription(String name) {

	}

	public void getDescription(String name, Integer age) {

	}

	public void getDescription(Integer age, String name) {

	}

	/*
	 * the below method is not allowed since only the return type is different
	 */
	/*
	 * public int getDescription() { return 1; }
	 */

}
