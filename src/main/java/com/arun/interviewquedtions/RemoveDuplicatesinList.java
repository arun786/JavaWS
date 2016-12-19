package com.arun.interviewquedtions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinList {

	public static void main(String[] args) {

		/* List Maintains an Insertion order */
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(45);
		lst.add(67);
		lst.add(78);
		lst.add(45);
		lst.add(7);
		lst.add(90);

		System.out.println("Values in a list " + lst);

		/*
		 * HashSet doesnot maintain an insertion order though it removes the
		 * duplicate
		 */
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(lst);
		System.out.println("Values in a set " + set);

		/* Linked HashSet maintains an insertion order and removes duplicate */
		
		Set<Integer> newSet = new LinkedHashSet<Integer>();
		newSet.addAll(lst);
		System.out.println("Values in a linked HashSet " + newSet);
	}

}
