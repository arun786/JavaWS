package com.arun.collections;

import java.util.HashMap;
import java.util.Map;

public class IteratingAMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Jan");
		map.put("2", "Feb");
		map.put("3", "Mar");
		map.put("4", "Apr");
		map.put("5", "May");
		map.put("6", "Jun");

		// 1. Iterating using Map.entry

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("======================");
		// 2. using Lambda
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("======================");
		// 3. using key
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
