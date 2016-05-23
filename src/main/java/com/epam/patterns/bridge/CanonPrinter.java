package com.epam.patterns.bridge;

import com.epam.patterns.model.Document;

public class CanonPrinter extends Printer {

	public CanonPrinter() {
		super(new CanonAPI());
	}

	@Override
	public void print(Document document) {
		api.print(document);
	}

}
