package com.java.beans;

public enum Gender {
	MALE("M"), FEMALE("F");

	private String key;

	Gender(String key) {
		this.key = key;
	}

	public String getValue() {
		return key;
	}

}
