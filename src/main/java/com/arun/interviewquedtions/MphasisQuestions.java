package com.arun.interviewquedtions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MphasisQuestions {

	public static void main(String[] args) {
		List<String> lst = readAFile();
		Map<String, Integer> unsortedMap = lstToMap(lst);
		
		System.out.println(sortByValue(unsortedMap));

	}

	public static Map<String, Integer> lstToMap(List<String> lst) {
		Map<String, Integer> map = new HashMap<>();
		int count = 1;
		for (String str : lst) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, count);
			}
		}
		return map;
	}

	public static List<String> readAFile() {
		List<String> lst = new ArrayList<>();
		ClassLoader loader = MphasisQuestions.class.getClassLoader();
		File file = new File(loader.getResource("TextFile.txt").getFile());

		FileReader reader = null;
		BufferedReader br = null;

		try {
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			String line = null;
			while ((line = br.readLine()) != null) {
				String lines[] = line.split("\\s+");
				for (String l : lines) {
					lst.add(l);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lst;
	}

	public static Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {

		List<Map.Entry<String, Integer>> lst = new LinkedList<>(unsortedMap.entrySet());

		Collections.sort(lst, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		for (Map.Entry<String, Integer> entry : lst) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}
}
