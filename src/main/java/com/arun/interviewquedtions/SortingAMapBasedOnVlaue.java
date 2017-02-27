package com.arun.interviewquedtions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingAMapBasedOnVlaue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 12);
		map.put("D", 13);
		map.put("B", 10);

		// Put it in a list
		List<Map.Entry<String, Integer>> lst = new LinkedList<>(map.entrySet());
		
		// sort the list
		Collections.sort(lst, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		/* Iterate the list and put it in a LinkedHashMap */
		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		for (Map.Entry<String, Integer> entry : lst) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);
	}

}
