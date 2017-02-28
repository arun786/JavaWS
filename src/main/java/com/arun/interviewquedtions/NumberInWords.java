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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number..");
		int number = scan.nextInt();
		if (number < 10 && number > 0) {
			System.out.println(unit.values()[number - 1]);
		}else if(number >9 && number <20){
			System.out.println(spnum.values()[number -10]);
		}else if(number > 19 && number <100){
			int unit_placeholder = number % 10;
			int ten_placeholder = (number - unit_placeholder)/10;
			System.out.println(tens.values()[ten_placeholder - 2] + " " + unit.values()[unit_placeholder -1]);
		}
	}

}
