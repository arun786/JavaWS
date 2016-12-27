package com.arun.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PropertiesOfHashSet {
	public static void main(String[] args) {
		Set<String> notOrderedHashSet = new HashSet<String>(Arrays.asList("Arun", "Kumar", "Singh"));
		System.out.println(notOrderedHashSet);
		/* O/p wont be in ordered fashion, doenot maintain insertion order */

		notOrderedHashSet.add("Cricket");
		System.out.println(notOrderedHashSet);
		// o/p [Cricket, Kumar, Arun, Singh]

		// how to retrieve values from a set, there is not get method for set

		// 1. To traverse
		for (String set : notOrderedHashSet) {
			System.out.print(set + " ");
			// o/p Cricket Kumar Arun Singh
		}
		System.out.println();
		// 2. To traverse

		Iterator<String> set = notOrderedHashSet.iterator();

		while (set.hasNext()) {
			System.out.print(set.next() + " ");
			// o/p Cricket Kumar Arun Singh
		}

		System.out.println();

		// 3. Java 8

		notOrderedHashSet.forEach(System.out::println);

		// Set doesnot take duplicate elements

		notOrderedHashSet.add("Arun");

		System.out.println(notOrderedHashSet);
		// o/p [Cricket, Kumar, Arun, Singh]
		
		/*to remove an element from a hashset while iterating, It gives a concurrentModificationException*/
		
		/*for(String str : notOrderedHashSet){
			notOrderedHashSet.remove(str);
		}*/
		
		
		/*To remove an element without getting exceptions*/
		
		Iterator<String> setIterator = notOrderedHashSet.iterator();
		while(setIterator.hasNext()){
			String element = setIterator.next();
			if(element.equals("Arun")){
				setIterator.remove();
			}
		}
		
		System.out.println(notOrderedHashSet);
		
		
		
		
		
		
		
		
	}

}
