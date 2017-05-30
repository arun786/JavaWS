package com.arun.hackerrank;

import java.util.Scanner;

public class JavaSTDINSTDOUT {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int myInt = scanner.nextInt();
		double myDouble = scanner.nextDouble();
		scanner.nextLine();
		String myString = scanner.nextLine();
		scanner.close();
		
		
		System.out.println("Int is " + myInt);
		System.out.println("Double is " + myDouble);
		System.out.println("my String is " + myString);
	}

}
