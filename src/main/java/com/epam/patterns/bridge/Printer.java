package com.epam.patterns.bridge;

import com.epam.patterns.model.Document;

public abstract class Printer {
	protected PrinterAPI api;

	public Printer(PrinterAPI api) {
		this.api = api;
	}

	public abstract void print(Document document);
}
