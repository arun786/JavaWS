package com.arun.enumexamples;

public class EnumOverridingMethod {
	public enum Color {
		RED("RED"), GREEN("GREEN"), BLUE("BLUE");
		private String description;

		private Color(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return description.substring(0, 1).toLowerCase() + description.substring(1).toUpperCase();
		}
	};

	public static void main(String[] args) {
		Color red = Color.RED;
		System.out.println(red);
		Color green = Color.GREEN;
		System.out.println(green);
	}

}
