package com.arun.interviewquedtions;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println("Please enter the number for which you want recursion..");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = factorial(number);
		System.out.println(result);
		scan.close();
	}

	public static int factorial(int number) {
		return number == 1 ? 1 : factorial(number - 1) * number;
	}
}
