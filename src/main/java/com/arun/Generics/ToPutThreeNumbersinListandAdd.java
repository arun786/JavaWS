package com.arun.Generics;

import java.util.Arrays;
import java.util.List;

public class ToPutThreeNumbersinListandAdd {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(10,12,24);
		int sum = 0;
		for(int element : lst){
			sum +=element;
		}
		System.out.println("Sum of the number " +  sum);
		/*o/p : Sum of the number 46*/
	}

}
