package com.arun.interviewquedtions;

import java.math.BigDecimal;

public class BiDecimalExample {

	public static void main(String[] args) {
		/* for financial calculation we should be using bigdecimal */
		double amount1 = 4.15;
		double amount2 = 5.16;

		System.out.println("the difference between 2 will be " + (amount2 - amount1));

		/*
		 * o/p will be the difference between 2 will be 1.0099999999999998
		 */

		BigDecimal amount3 = new BigDecimal("4.15");
		BigDecimal amount4 = new BigDecimal("5.16");

		System.out.println("the difference will be as " + amount4.subtract(amount3));

		/*
		 * o/p will be the difference will be as 1.01, its better to use
		 * Bigdecimal
		 */
		
		/*But if we use overloaded constructor for BigDecimal, we will have the same problem*/
		
		BigDecimal amount5 = new BigDecimal(4.15);
		BigDecimal amount6 = new BigDecimal(5.16);
		
		System.out.println("the difference will be as " + amount6.subtract(amount5));
	}

}
