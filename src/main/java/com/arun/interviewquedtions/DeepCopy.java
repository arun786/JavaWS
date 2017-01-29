package com.arun.interviewquedtions;

public class DeepCopy {

	public static void main(String[] args) {
		Students student = new Students("Arun", "physics");
		Students studentClone = (Students) student.clone();
		System.out.println("Main class " + student);
		System.out.println("Cloned class " + studentClone);
		student.setName("Main Class Name Changed");
		Subjects subject = new Subjects("Subject changed for main");
		student.setSubject(subject);
		subject = new Subjects("subject changed for Cloned");
		studentClone.setName("cloned class name changed");
		studentClone.setSubject(subject);
		System.out.println(student);
		System.out.println(studentClone);
		
		/*
		 * o/p will be Main class Students [name=Arun, subject=Subjects [name=physics]] 
		 * Cloned class Students [name=Arun, subject=Subjects [name=physics]] 
		 * Students [name=Main Class Name Changed, subject=Subjects [name=Subject changed for main]] 
		 * Students [name=cloned class name changed, subject=Subjects [name=subject changed for Cloned]]
		 */

	}

}

class Subjects {
	private String name;

	public Subjects(String name) {
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
		return "Subjects [name=" + name + "]";
	}
}

class Students implements Cloneable {
	private String name;
	private Subjects subject;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subjects getSubject() {
		return subject;
	}

	public void setSubject(Subjects subject) {
		this.subject = subject;
	}

	public Students(String name, String subject) {
		super();
		this.name = name;
		this.subject = new Subjects(subject);
	}

	/*Deep Copy*/
	public Object clone() {
		return new Students(name, subject.getName());
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", subject=" + subject + "]";
	}
}
