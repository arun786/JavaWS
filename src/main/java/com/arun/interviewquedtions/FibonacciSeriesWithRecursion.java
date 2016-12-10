package com.arun.interviewquedtions;

import java.util.Scanner;

public class FibonacciSeriesWithRecursion {

	public static void main(String[] args) {
		System.out.println("Please enter the number X for the number at that series");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		System.out.println("fibonacci Series for " + fibonacciNumber(number - 1));
		scan.close();
	}

	public static int fibonacciNumber(int number) {
		if (number < 1) {
			return 0;
		}

		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
	}
}
