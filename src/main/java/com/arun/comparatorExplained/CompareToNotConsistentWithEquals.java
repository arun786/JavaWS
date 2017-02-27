package com.arun.comparatorExplained;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
		
		Set<BigDecimal> h1 = new HashSet<>(); //it uses compareTo to find duplicates.
		h1.add(b1);
		h1.add(b2);
		
		/*o/p will be : [2.00, 2.0]*/
		
		System.out.println(h1);
		
		Set<BigDecimal> t1 = new TreeSet<>(); //It uses equals to find duplicates
		t1.add(b1);
		t1.add(b2);
		
		System.out.println(t1);
		
		/*o/p will be : [2.0]*/
	}

}
