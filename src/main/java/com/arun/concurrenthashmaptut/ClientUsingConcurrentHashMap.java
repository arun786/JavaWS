package com.arun.concurrenthashmaptut;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClientUsingConcurrentHashMap {
	public static void main(String[] args) {
		Map<String, Integer> synchMap = new ConcurrentHashMap<String, Integer>();
		MapHelper1 map1 = new MapHelper1(synchMap);
		MapHelper2 map2 = new MapHelper2(synchMap);
		MapHelper3 map3 = new MapHelper3(synchMap);
		MapHelper4 map4 = new MapHelper4(synchMap);

		for (Map.Entry<String, Integer> m : synchMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		/*o/p will be 
		one : 1
		Four : 4
		two : 2
		Three : 3
		Helper1 sleeping
		Helper2 sleeping
		Helper3 sleeping
		Helper4 sleeping*/

	}
}
