/**
 * 
 */
package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Adwiti
 *
 */
public class BoxingAndUnboxing {
	
	public void exampleOfAutoboxing(){
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1); //autoboxing - primitive to object
		lst.add(2); //autoboxing
		
		int firstValue = lst.get(0); //unboxing, converting Object to int
	}

	/*
	 * Here we define List as Integer but while iterating we use int. This is
	 * more efficient compared to iterating through Integer where boxing and
	 * unboxing takes place
	 */
	public static int sum(List<Integer> lst) {
		int sum = 0;
		for (int i : lst) {
			sum += i;
		}
		return sum;
	}

	/*
	 * we are using Integer to iterate where boxing and Unboxing takes place and
	 * as a result the code is less efficient
	 */
	public static int sumOfInteger(List<Integer> lst) {
		int sum = 0;
		for (Integer i : lst) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("sum : " + sum(Arrays.asList(10, 10, 30)));
		System.out.println("Sum of Integer : " + sumOfInteger(Arrays.asList(100, 200, 300)));
		System.out.println(sum(Arrays.asList(10, 20, 30)) == sumOfInteger(Arrays.asList(10, 20, 30)));
		System.out.println(sum(Arrays.asList(100, 200, 300)) == sumOfInteger(Arrays.asList(100, 200, 300)));
	}
}

/*
 * o/p will be
 * 
 * sum : 50
 * 
 * Sum of Integer : 600
 * 
 * true
 * 
 * true
 */
