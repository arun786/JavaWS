package com.arun.enumexamples;

public class EnumInSwitchCase {

	public enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {

		Days[] days = Days.values();

		for (Days day : days) {
			switch (day) {
			case SUNDAY:
				System.out.println("This is Sunday");
				break;
			case MONDAY:
				System.out.println("This is Monday");
				break;
			case TUESDAY:
				System.out.println("This is Tuesday");
				break;
			case WEDNESDAY:
				System.out.println("This is Wednesday");
				break;
			case THURSDAY:
				System.out.println("This is Thursday");
				break;
			case FRIDAY:
				System.out.println("This is Friday");
				break;
			case SATURDAY:
				System.out.println("This is Saturday");
				break;
			default:
				break;
			}
		}

	}

}
