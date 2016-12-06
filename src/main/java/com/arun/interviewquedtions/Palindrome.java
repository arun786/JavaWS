package com.arun.interviewquedtions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Please enter a word..");
		Scanner scan = new Scanner(System.in);
		String checkPallindrome = scan.next();
		String reverseOfcheckPallindrome = "";
		
		for(int i=checkPallindrome.length()-1; i>=0 ;i--){
			reverseOfcheckPallindrome=reverseOfcheckPallindrome+checkPallindrome.charAt(i);
		}
		if(reverseOfcheckPallindrome.equals(checkPallindrome)){
			System.out.println("Word entered is Pallindrome");
		}else{
			System.out.println("Not a Pallindrome");
		}
		scan.close();
	}

}
