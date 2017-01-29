package com.arun.interviewquedtions;

import java.util.Date;

public class ImmutableClassWithDeepCopy {

	public static void main(String[] args) {
		ImmutableDefined id = ImmutableDefined.getInstance("Adwiti", "2", new Date());
		System.out.println(id);
		modifyImmutableObject(id.getName(), id.getAge(), id.getDate());
		System.out.println(id);

		MutableDefined mutableId = new MutableDefined("Adun", "21", new Date());
		System.out.println(mutableId);
		modifyImmutableObject(mutableId.getName(), mutableId.getAge(), mutableId.getDate());
		System.out.println(mutableId);

		/*
		 * ImmutableDefined [name=Adwiti, age=2, date=Sat Jan 28 19:03:17 MST
		 * 2017] ImmutableDefined [name=Adwiti, age=2, date=Sat Jan 28 19:03:17
		 * MST 2017] MutableDefined [name=Adun, age=21, date=Sat Jan 28 19:03:17
		 * MST 2017] MutableDefined [name=Adun, age=21, date=Wed Dec 31 17:00:00
		 * MST 1969]
		 */

	}

	public static void modifyImmutableObject(String name, String age, Date date) {
		name = "Arun";
		age = "10";
		date.setTime(10);
	}

}

final class ImmutableDefined {

	/* Class made final so that it can be inherited */

	private final String name;
	private final String age;
	private final Date date;

	/* Make the constructor as private */
	private ImmutableDefined(String name, String age, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.date = new Date(date.getTime());

	}

	/* No setters only getters */
	public String getName() {
		return name;
	}

	/* No setters only getters */
	public String getAge() {
		return age;
	}

	/*
	 * get the instance of the class from a method, this will be a factory
	 * method
	 */
	public static ImmutableDefined getInstance(String name, String age, Date date) {
		return new ImmutableDefined(name, age, date);
	}

	/*
	 * If we have a mutable object in the class which can be referred from
	 * outside of the class return a copy of it
	 */

	public Date getDate() {
		return new Date(date.getTime());
	}

	@Override
	public String toString() {
		return "ImmutableDefined [name=" + name + ", age=" + age + ", date=" + date + "]";
	}

}

class MutableDefined {
	private String name;
	private String age;
	private Date date;

	public MutableDefined(String name, String age, Date date) {
		this.name = name;
		this.age = age;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "MutableDefined [name=" + name + ", age=" + age + ", date=" + date + "]";
	}
}
