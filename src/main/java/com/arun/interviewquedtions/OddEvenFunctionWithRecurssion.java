package com.arun.interviewquedtions;

import java.util.Scanner;

public class OddEvenFunctionWithRecurssion {

	public static void main(String[] args) {

		System.out.println("Please enter a number..");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String result = OddEven(number) == 0 ? "Even" : "Odd";
		System.out.println("Number is " + result);
	}

	public static int OddEven(int number) {
		return number == 0 ? 0 : number < 0 ? 1 : OddEven(number-2);
	}
}