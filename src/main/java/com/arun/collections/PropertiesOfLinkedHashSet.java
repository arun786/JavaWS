package com.arun.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PropertiesOfLinkedHashSet {
	public static void main(String[] args) {
		
		
		Set<String> maintainsOrderFashion = new LinkedHashSet<>(Arrays.asList("Arun", "Kumar", "Singh"));
		System.out.println(maintainsOrderFashion);
		
		/*o/p [Arun, Kumar, Singh]*/
		/*Maintains Insertion order*/
		
		maintainsOrderFashion.add("USA");
		System.out.println(maintainsOrderFashion);
		
		maintainsOrderFashion.add("USA");
		System.out.println(maintainsOrderFashion);
		
		/*o/p [Arun, Kumar, Singh, USA]*/
		/*Doesnot take duplicates*/
		
		/*to iterate over a LinkedHashSet*/
		
		//1.using an iterator
		
		Iterator<String> lHs = maintainsOrderFashion.iterator();
		while(lHs.hasNext()){
			System.out.println(lHs.next());
		}
		
		//2. forEach Java 8
		maintainsOrderFashion.forEach(System.out::print);
			
		//3. For each Java 7
		for(String str : maintainsOrderFashion){
			System.out.println(str);
		}
		
		//To remove an element from LinkedHashSet, using for each will give concurrent modification exception
		/*for(String remove : maintainsOrderFashion){
			if(remove.equals("Arun"))
				maintainsOrderFashion.remove(remove);
		}
		System.out.println(maintainsOrderFashion);*/
		
		//To remove an element, we need to use Iterator
		
		Iterator<String> it = maintainsOrderFashion.iterator();
		while(it.hasNext()){
			String element = it.next();
			if(element.equals("Arun")){
				it.remove();
			}
		}
		System.out.println(maintainsOrderFashion);
		
		
		
		
		
		
		
	}

}
