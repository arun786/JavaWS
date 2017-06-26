package com.arun.interviewquedtions;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		// Anagram example pot and top

		System.out.println("Enter first number...");
		Scanner scan = new Scanner(System.in);
		String firstWord = scan.next();

		System.out.println("Enter the Second Number...");
		scan = new Scanner(System.in);
		String secondWord = scan.next();
		System.out.println("Words are Anagram " + isAnagram(firstWord, secondWord));
	}

	public static boolean isAnagram(String firstWord, String secondWord) {
		boolean flag = false;
		String space = " ";
		if (firstWord.length() == secondWord.length()) {
			for (int i = 0; i < firstWord.length(); i++) {
				flag = false;
				for (int j = 0; j < secondWord.length(); j++) {
					if (firstWord.toLowerCase().charAt(i) == secondWord.toLowerCase().charAt(j)) {
						flag = true;
						if (j == 0) {
							secondWord = secondWord.substring(j + 1);
						}else{
							secondWord = secondWord.substring(0, j) +  secondWord.substring(j+1);
						}
						break;
					}
				}
				if (flag == false) {
					return flag;
				}
			}

			return flag;
		} else {
			return false;
		}
	}
}
