package com.arun.comparatorExplained;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CompareToNotConsistentWithEquals {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("2.0");
		BigDecimal b2 = new BigDecimal("2.00");

		System.out.println(b1.compareTo(b2)); // 0
		System.out.println(b1.equals(b2));// false

		String s1 = new String("2.0");
		String s2 = new String("2.00");

		System.out.println(s1.compareTo(s2)); // -1
		System.out.println(s1.equals(s2)); // false

		Set<BigDecimal> h1 = new HashSet<>(); // it uses compareTo to find
												// duplicates.
		h1.add(b1);
		h1.add(b2);

		/* o/p will be : [2.00, 2.0] */

		System.out.println(h1);

		Set<BigDecimal> t1 = new TreeSet<>(); // It uses equals to find
												// duplicates
		t1.add(b1);
		t1.add(b2);

		System.out.println(t1);

		/* o/p will be : [2.0] */

		Student st1 = new Student("Arun", "12");
		Student st2 = new Student("Arun", "13");
		Student st3 = new Student("Arun","11");
		Student st4 = new Student("Adwiti","14");
		
		List<Student> lst = new ArrayList<>();
		lst.add(st1);
		lst.add(st2);
		lst.add(st3);
		lst.add(st4);
		
		Collections.sort(lst);
		System.out.println(lst);
		System.out.println(st2.compareTo(st1)); 
		/*o/p will be [Student [name=Adwiti, age=14], Student [name=Arun, age=11], Student [name=Arun, age=12], Student [name=Arun, age=13]]*/
		
		

	}

}

class Student implements Comparable<Student> {
	private String name;
	private String age;

	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		int number = this.name.compareTo(o.name);

		if (number == 0) {
			number = this.age.compareTo(o.age);
		}
		return number;
	}

}
