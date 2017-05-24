package com.arun.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DequeImplementation {

	private final static String ascendingOrder = "a";
	private final static String descendingOrder = "d";

	public static void main(String[] args) {

		Deque<Student> dq = new ArrayDeque<>();

		Student st1 = new Student("1", "ten", "a", "10");
		Student st11 = new Student("2", "ten", "a", "100");
		Student st12 = new Student("3", "ten", "a", "1000");
		Student st13 = new Student("4", "ten", "a", "10000");
		Student st14 = new Student("5", "ten", "a", "100000");
		Student st15 = new Student("6", "ten", "a", "20");
		Student st16 = new Student("7", "ten", "a", "101");
		Student st17 = new Student("8", "ten", "a", "1011");
		Student st18 = new Student("9", "ten", "a", "102");
		Student st19 = new Student("10", "ten", "a", "103");
		Student st20 = new Student("11", "ten", "a", "104");
		Student st21 = new Student("12", "ten", "a", "105");
		Student st22 = new Student("13", "ten", "a", "106");

		dq.push(st1);
		dq.push(st11);
		dq.push(st12);
		dq.push(st13);
		dq.push(st14);
		dq.push(st15);
		dq.push(st16);
		dq.push(st17);
		dq.push(st18);
		dq.push(st19);
		dq.push(st20);
		dq.push(st21);
		dq.push(st22);
		
		List<Student> lastTwo = getStudentFromQueue(dq, descendingOrder);
		
		System.out.println("from end of Queue..");
		for(Student st : lastTwo){
			System.out.println(st);
		}
		
		List<Student> firstTwo = getStudentFromQueue(dq, ascendingOrder);
		System.out.println("from beginning of the queue...");
		for(Student s : firstTwo){
			System.out.println(s);
		}
	}

	/**
	 * 
	 * @param students
	 * @return
	 * 
	 * 		Returns 2 elements from the Deque
	 */
	public static List<Student> getStudentFromQueue(Deque<Student> students, String preference) {
		List<Student> twoStudent = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			if (!students.isEmpty()) {

				if (descendingOrder.equals(preference)) {
					/**
					 * pollLast removes the elements from the end of the queue
					 */
					twoStudent.add(students.pollFirst());

				} else if (ascendingOrder.equals(preference)) {
					/**
					 * pollFirst removes the element from the beginning of the
					 * queue
					 */
					twoStudent.add(students.pollLast());
				}
			}
		}

		return twoStudent;
	}
}

class Student {
	private String id;
	private String standard;
	private String name;
	private String age;

	public Student(String id, String standard, String name, String age) {
		super();
		this.id = id;
		this.standard = standard;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", standard=");
		builder.append(standard);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
}


/*o/p will be */

/*from end of Queue..
Student [id=13, standard=ten, name=a, age=106]
Student [id=12, standard=ten, name=a, age=105]
from beginning of the queue...
Student [id=1, standard=ten, name=a, age=10]
Student [id=2, standard=ten, name=a, age=100]*/