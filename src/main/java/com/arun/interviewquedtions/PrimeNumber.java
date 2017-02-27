package com.arun.interviewquedtions;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number...");
		System.out.println(isPrime(scan.nextInt()));
		scan.close();
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
}
