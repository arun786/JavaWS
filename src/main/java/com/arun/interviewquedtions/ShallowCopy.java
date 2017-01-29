package com.arun.interviewquedtions;

public class ShallowCopy {

	public static void main(String[] args) {

		Student student = new Student("Arun", "10", "Physics");
		System.out.println("Original before change = " + student.getName() + " : " + student.getSubject().getName());

		/*
		 * Shallow copy will refer to the same Object , Any changes to the
		 * Object will make changes to the cloned object.
		 */
		Student studentCloned = (Student) student.clone();
		student.setName("Adwiti");
		student.getSubject().setName("Chemistry");
		System.out.println("Original = " + student.getName() + " : " + student.getSubject().getName());
		System.out.println("Cloned = " + studentCloned.getName() + " : " + studentCloned.getSubject().getName());

		/*
		 * o/p will be 
		 * Original before change = Arun : Physics 
		 * Original = Adwiti : Chemistry 
		 * Cloned = Arun : Chemistry
		 */
	}

}

class Subject {
	private String name;

	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + "]";
	}

}

class Student implements Cloneable {
	private String name;
	private String age;
	private Subject subject;

	public Student(String name, String age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = new Subject(subject);
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", subject=" + subject + "]";
	}

}
