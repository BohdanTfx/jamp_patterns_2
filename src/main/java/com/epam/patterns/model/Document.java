package com.epam.patterns.model;

public class Document {
	private String name;

	public Document(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
