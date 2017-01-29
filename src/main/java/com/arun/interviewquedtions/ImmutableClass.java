package com.arun.interviewquedtions;

public final class ImmutableClass {

	/*
	 * Immutable classes are those class whose state cannot be changed. Any
	 * modification on Immutable Object will result in creation of another
	 * Immutable Object
	 * 
	 * ways of making a class final
	 * 
	 * 1. class is made final so that it cannot be inherited 
	 * 2. All the variables are final 
	 * 3. No setters
	 */

	private final String id;
	private final String name;
	
	public ImmutableClass(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
