package com.epam.patterns.bridge;

import com.epam.patterns.model.Document;

public class EpsonAPI implements PrinterAPI {

	@Override
	public void print(Document document) {
		System.out.println("Epson " + document);
	}

}
