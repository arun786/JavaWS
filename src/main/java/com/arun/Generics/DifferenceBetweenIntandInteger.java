package com.arun.Generics;

import java.util.Arrays;
import java.util.List;

public class DifferenceBetweenIntandInteger {
	
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(100,200,300);
		System.out.println(sum(lst) == sumOfInteger(lst));  //o/p will be true
 		System.out.println(sumOfInteger(lst) != sumOfInteger(lst)); //o/p will be true
	}

	public static int sum(List<Integer> lst) {
		int sum = 0;
		for (int i : lst) {
			sum += i;
		}
		return sum;
	}

	public static Integer sumOfInteger(List<Integer> lst) {
		Integer sum = 0;
		for (Integer i : lst) {
			sum += i;
		}
		return sum;
	}

}
