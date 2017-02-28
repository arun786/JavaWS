package com.arun.interviewquedtions;

import java.util.Scanner;

public class NumberInWords {

	public enum spnum {
		ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, ninteen
	}

	public enum unit {
		one, two, three, four, five, six, seven, eight, nine
	}

	public enum tens {
		twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninty
	}

	public enum sp3 {
		onehundred, twohundred, threehundered, fourhundred, fivehundred, sixhundred, sevenhundred, eighthundred, ninehundred
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number..");
		int number = scan.nextInt();
		int unit_placeholder = number % 10;
		int ten_placeholder = 0;
		int hundred_placeholder = 0;

		if (number < 10 && number > 0) {
			System.out.println(unit.values()[number - 1]);
		} else if (number > 9 && number < 20) {
			System.out.println(spnum.values()[number - 10]);
		} else if (number > 19 && number < 100) {
			ten_placeholder = (number - unit_placeholder) / 10;
			if (unit_placeholder == 0) {
				System.out.println(tens.values()[number / 10 - 2]);
			} else {

				System.out.println(tens.values()[ten_placeholder - 2] + " " + unit.values()[unit_placeholder - 1]);
			}
		} else if (number > 120 && number < 999) {
			unit_placeholder = (number % 100) % 10;
			ten_placeholder = ((number % 100) - unit_placeholder)/10;
			hundred_placeholder = (number - (number % 100)) / 100;
			System.out.println(sp3.values()[hundred_placeholder-1] + " " + tens.values()[ten_placeholder - 2] + " "
					+ unit.values()[unit_placeholder - 1]);
		}
	}

}
