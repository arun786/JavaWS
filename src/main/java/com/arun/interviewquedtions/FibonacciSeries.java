package com.arun.interviewquedtions;

import java.util.Scanner;

public class FibonacciSeries {

	/* series with the below 0,1,1,2,3,5,8,13.... */

	public static void main(String[] args) {
		int firstXnumber = 0;
		System.out.println("Give first X fibonacci series. Enter X..");
		Scanner scan = new Scanner(System.in);
		int till = scan.nextInt();
		System.out.println();
		int sum = 1;
		int previousSum = 0;
		System.out.print(previousSum + " " + sum + " ");
		while (firstXnumber < till) {
			int temp = sum;
			sum = sum + previousSum;
			previousSum = temp;
			firstXnumber++;

			System.out.print(sum + " ");
		}
		scan.close();
	}
}
