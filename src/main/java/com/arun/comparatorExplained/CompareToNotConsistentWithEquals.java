package com.arun.comparatorExplained;

import java.math.BigDecimal;

public class CompareToNotConsistentWithEquals {
	
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("2.0");
		BigDecimal b2 = new BigDecimal("2.00");
		
		System.out.println(b1.compareTo(b2)); //0
		System.out.println(b1.equals(b2));//false
		
		String s1 = new String("2.0");
		String s2 = new String("2.00");
		
		System.out.println(s1.compareTo(s2));  //-1
		System.out.println(s1.equals(s2)); //false
	}

}
