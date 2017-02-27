package com.arun.interviewquedtions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingAMapBasedOnKey {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("C", 12);
		map.put("B", 9);

		List<Map.Entry<String, Integer>> lst = new ArrayList<>(map.entrySet());

		Collections.sort(lst, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : lst) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sortedMap);

	}

}
