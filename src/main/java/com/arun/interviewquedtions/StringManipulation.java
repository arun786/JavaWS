package com.arun.interviewquedtions;

public class StringManipulation {
	public static void main(String[] args) {
		
		System.out.println("Reversing a String witout using reverse keyword");
		String source = "Hello World";
		String reverse = "";
		for (int i = source.length() - 1; i >= 0; i--) {
			reverse += source.charAt(i);
		}

		System.out.println("Reversing " + source + " to "+reverse);
	}
}
