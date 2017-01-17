package com.arun.interviewquedtions;

public class AccessSpecifiedProtected extends Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.a);

		Test test1 = new AccessSpecifiedProtected();
		System.out.println(test1.a);
	}

	public void protectedField() {
		System.out.println(a);
		/* Protected field accessible if the class is a subclass */
	}
}

class Test {
	protected int a = 10;
}

class Test1 extends com.arun.Generics.AccessSpecifiedProtected {
	public void canProtectedAccess() {
		System.out.println(a);
		/* a is from different package and if protected can be accessible */
	}
}
