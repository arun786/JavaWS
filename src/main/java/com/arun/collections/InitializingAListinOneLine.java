package com.arun.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializingAListinOneLine {
	public static void main(String[] args) {
		String str[] = { "arun", "Adwiti", "Pushpa" };
		List<String> lst = Arrays.asList(str);
		System.out.println(lst);

		// We cannot delete or modify the list

		//lst.add("India"); // It will give UnsupportedOperationException.

		//lst.remove(0); // It will give UnsupportedOperationException.
		
		List<String> copiedLst = new ArrayList<String>(lst); //Copying the list to another list
		
		System.out.println(copiedLst);
		
		copiedLst.add("USA");
		
		System.out.println(copiedLst);
		
		List<String> myList = new ArrayList<String>(Arrays.asList("arun", "Adwiti", "Pushpa"));
		myList.add("USA");
		
		System.out.println(myList);
		
	}

}
