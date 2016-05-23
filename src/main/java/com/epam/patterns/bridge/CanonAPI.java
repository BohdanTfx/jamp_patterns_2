package com.epam.patterns.bridge;

import com.epam.patterns.model.Document;

public class CanonAPI implements PrinterAPI {

	@Override
	public void print(Document document) {
		System.out.println("Canon " + document);
	}

}
