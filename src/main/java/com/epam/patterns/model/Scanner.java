package com.epam.patterns.model;

public class Scanner extends Printer {
	public Document scan() {
		return new Document("New name");
	}

	public void copy() {
		print(scan());
	}
}
