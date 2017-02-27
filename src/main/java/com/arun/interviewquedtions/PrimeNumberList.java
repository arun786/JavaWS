package com.arun.interviewquedtions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number...");
		List<Integer> lst = getPrimeNumber(scan.nextInt());
		System.out.println(lst);
		scan.close();
	}

	static List<Integer> getPrimeNumber(Integer number) {
		List<Integer> lst = new ArrayList<>();

		for (int i = 2; i < number; i++) {
			if (isPrime(i))
				lst.add(i);
		}
		return lst;
	}

	public static boolean isPrime(Integer number) {
		if (number % 2 == 0) {
			return false;
		}

		int sqrt = (int) Math.sqrt(number);

		for (int i = 3; i <= sqrt; i = i + 2) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;

	}
	/*	o/p will be
	Please enter a number...
	100
	[3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]*/
}
