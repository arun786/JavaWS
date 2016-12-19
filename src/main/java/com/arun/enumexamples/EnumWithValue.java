package com.arun.enumexamples;

public class EnumWithValue {

	public enum SEASON {
		SUMMER(10), WINTER(20), SPRING(30), AUTUMN(40);

		private int number;

		private SEASON(int number) {
			this.number = number;
		}

		public int getValue() {
			return number;
		}
	}

	public static void main(String[] args) {

		SEASON season = SEASON.AUTUMN;
		System.out.println(season.getValue());

	}
}
