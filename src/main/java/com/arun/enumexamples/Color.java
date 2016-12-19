package com.arun.enumexamples;

public enum Color {

	/* Constants in an enum is static and final */
	RED(255, 0, 0), BLUE(0, 0, 255), YELLOW(255, 255, 0), BLACK(0, 0, 0);

	private int red;
	private int green;
	private int blue;

	private Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public String getValue() {
		return String.format("%d,%d,%d", red, green, blue);
	}
}
