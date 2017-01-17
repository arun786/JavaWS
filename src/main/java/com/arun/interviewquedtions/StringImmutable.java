package com.arun.interviewquedtions;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";

		System.out.println(s1 + " " + s1.hashCode());
		System.out.println(s2 + " " + s2.hashCode());

		s2 = "c++";

		System.out.println(s1 + " " + s1.hashCode());
		System.out.println(s2 + " " + s2.hashCode());

		/*
		 * o/p will be - java 3254818 java 3254818 java 3254818 c++ 96515
		 */

		/*
		 * if String was not Immutable, then the value of s1 would also have
		 * changed, since the primary motive of String was to share.
		 */

	}

}
