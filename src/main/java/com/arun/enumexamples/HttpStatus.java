package com.arun.enumexamples;

public enum HttpStatus {

	SUCCESSFUL(200, "OK");

	private int code;
	private String description;

	private HttpStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

}
