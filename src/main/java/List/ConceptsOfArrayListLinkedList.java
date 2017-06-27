package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConceptsOfArrayListLinkedList {

	public static void main(String[] args) {

		System.out.println("ArrayList");
		performanceOfArrayList();

		System.out.println("Linked List");
		performanceOfLinkedList();

		/*
		 * o/p will be ArrayList
		 * 
		 * time taken 3536
		 * 
		 * time taken 7
		 * 
		 * Linked List
		 * 
		 * time taken 7743
		 * 
		 * time taken 0
		 */

	}

	public static void performanceOfArrayList() {
		List<Integer> lst = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			lst.add(i);
		}
		long end = System.currentTimeMillis();

		lst.add(3, 6);
		long end1 = System.currentTimeMillis();

		System.out.println("time taken " + (end - start));
		System.out.println("time taken " + (end1 - end));
	}

	public static void performanceOfLinkedList() {
		List<Integer> lst = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			lst.add(i);
		}
		long end = System.currentTimeMillis();

		lst.add(3, 6);
		long end1 = System.currentTimeMillis();

		System.out.println("time taken " + (end - start));
		System.out.println("time taken " + (end1 - end));
	}

}
