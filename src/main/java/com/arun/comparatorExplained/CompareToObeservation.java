package com.arun.comparatorExplained;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareToObeservation {

	public static void main(String[] args) {
		CompareToImpl o1 = new CompareToImpl("aaa");
		CompareToImpl o2 = new CompareToImpl("a");

		List<CompareToImpl> lst = new ArrayList<>();
		lst.add(o1);
		lst.add(o2);
		Collections.sort(lst);

		System.out.println(lst);
		
		System.out.println(o1.compareTo(o2));
	}

}

class CompareToImpl implements Comparable<CompareToImpl> {

	private String name;

	public CompareToImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(CompareToImpl o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "CompareTo [name=" + name + "]";
	}

}
