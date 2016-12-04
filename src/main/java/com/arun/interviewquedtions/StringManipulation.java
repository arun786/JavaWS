package com.arun.interviewquedtions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {
	public static void main(String[] args) {

		System.out.println("Reversing a String witout using reverse keyword");
		String source = "Hello World";
		String reverse = "";
		for (int i = source.length() - 1; i >= 0; i--) {
			reverse += source.charAt(i);
		}

		System.out.println("Reversing " + source + " to " + reverse);
		System.out.println("----------------------------");
		System.out.println("String is stored in string pool");
		/* When we create a String literal it is cached in String pool */
		String s1 = "Hello World";
		String s2 = "Hello World";

		/*
		 * S1 and S2 will be pointing to the same reference which can be checked
		 * using == operator
		 */
		System.out.println("Do S1 and S2 point to the same memory reference " + (s1 == s2)); // true

		/* String are immutable */
		System.out.println("String is Immutable");
		System.out.println(s1.toUpperCase()); // this will reflect the changes
		System.out.println(s1); // but this wont

		/*
		 * If we create a String using new Operator, it is not interned, which
		 * means it will have a new reference in the memory of pool, so S1 and
		 * S3 will not be same when compared with == operator
		 */

		String s3 = new String("Hello World");
		System.out.println("This wont be true " + (s1 == s3));

		/*
		 * But if we intern the String, it will have the same reference in the
		 * pool
		 */
		String s4 = new String("Hello World").intern();

		System.out.println("s1 and S4 will be pointing to the same memory reference " + (s1 == s4)); // true

		// checking regular expression

		String toCheckApraticularWord = "India has been touring abroad since last 10 years and still has not been able to successfully win a series outside India";
		Pattern pattern = Pattern.compile("a");
		Matcher matches = pattern.matcher(toCheckApraticularWord);
		int count = 0;
		while (matches.find()) {
			count++;
		}
		System.out.println("Number of occurences " + count);

		/*
		 * Before Java 1.7 there was a memory leak in SubString, but it has been
		 * modified in Java 1.7
		 */
		System.out.println("substring in String");
		String memoryLeak = "Todayissun";
		// 0123456789
		System.out.println(memoryLeak.substring(0, 4)); // will give o/p as
														// Toda.
		System.out.println(memoryLeak.substring(memoryLeak.length())); // it
																		// will
																		// return
																		// blank
		// System.out.println(memoryLeak.length()); //It will print blank
		// System.out.println(memoryLeak.substring(11));
		// //StringIndexoutofboundexception
		// System.out.println(memoryLeak.substring(5,1));
		// //StringIndexoutofboundexception
		// System.out.println(memoryLeak.substring(0,11));
		// //StringIndexoutofboundexception
		// System.out.println(memoryLeak.substring(0,0)); //It will print blank

		String toPrintroof = "Barefoot";
		System.out.println(toPrintroof.substring(2, 3) + toPrintroof.substring(5, 7) + toPrintroof.substring(4, 5));

	}
}
