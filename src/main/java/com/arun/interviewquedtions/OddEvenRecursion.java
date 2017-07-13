package com.arun.interviewquedtions;

import java.util.Scanner;

public class OddEvenRecursion {

	public static void main(String[] args) {

		System.out.println("Enter the number..");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String evenodd = OddEven(number) == 0 ? "Even" : "Odd";
		System.out.println("Number added is " + evenodd);
		scan.close();
	}

	public static int OddEven(int number) {
		if (number == 0) {
			return 0;
		}
		if (number < 0) {
			return 1;
		}

		return OddEven(number - 2);
	}

}
