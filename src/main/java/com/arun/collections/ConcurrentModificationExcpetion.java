package com.arun.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ConcurrentModificationExcpetion {
	
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>(Arrays.asList("Arun","Kumar", "Singh"));
		
		//proper way of removing elements from a list
		
		Iterator<String> it = lst.iterator();
		while(it.hasNext()){
			String element = it.next();
			if(element.equals("Kumar"))
				it.remove();
				//lst.remove(element); //this will also work
		}
		System.out.println(lst);
		
		Set<String> set = new HashSet<>(Arrays.asList("Arun","Kumar","Singh"));
		
		Iterator<String> iths = set.iterator();
		while(iths.hasNext()){
			String element = iths.next();
			if(element.equals("Arun")){
				set.remove(element); //this will give concurrent modification exception
				iths.remove();
			}
		
		}
		System.out.println(set);
	}

}
