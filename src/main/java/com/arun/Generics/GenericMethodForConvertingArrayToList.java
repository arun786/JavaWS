package com.arun.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodForConvertingArrayToList {
	
	public static void main(String[] args) {
		String str [] = {"arun","adwiti","Pushpa"};
		List<String> lst = toList(str);
		System.out.println(lst);
		
		Integer data [] = {10,20,30};
		List<Integer> lstInteger = toList(data);
		System.out.println(lstInteger);
	}

	public static <T> List<T> toList(T... array) {
		
		List<T> lst = new ArrayList<T>();
		for (T element : array) {
			lst.add(element);
		}
		return lst;
	}

}
