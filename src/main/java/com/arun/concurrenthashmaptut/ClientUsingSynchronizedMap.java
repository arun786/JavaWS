package com.arun.concurrenthashmaptut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClientUsingSynchronizedMap {

	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> synchMap = Collections.synchronizedMap(hashMap);
		MapHelper1 map1 = new MapHelper1(synchMap);
		MapHelper2 map2 = new MapHelper2(synchMap);
		MapHelper3 map3 = new MapHelper3(synchMap);
		MapHelper4 map4 = new MapHelper4(synchMap);

		for (Map.Entry<String, Integer> m : synchMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}

	}
	
	/*o/p will be 
	one : 1
	Exception in thread "main" java.util.ConcurrentModificationException
		at java.util.HashMap$HashIterator.nextNode(HashMap.java:1437)
		at java.util.HashMap$EntryIterator.next(HashMap.java:1471)
		at java.util.HashMap$EntryIterator.next(HashMap.java:1469)
		at com.arun.concurrenthashmaptut.ClientUsingSynchronizedMap.main(ClientUsingSynchronizedMap.java:18)
	Helper1 sleeping
	Helper2 sleeping
	Helper3 sleeping
	Helper4 sleeping
*/
}
