package com.epam.patterns.bridge;

import com.epam.patterns.model.Document;

public class EpsonPrinter extends Printer {

	public EpsonPrinter() {
		super(new EpsonAPI());
	}

	@Override
	public void print(Document document) {
		api.print(document);
	}

}
