package com.epam.patterns.proxy;

import com.epam.patterns.model.Plant;
import com.epam.patterns.model.Potato;

public class PotatoProxy implements Plant {
	private Potato potato;
	private String before;
	private String after;

	public PotatoProxy(String before, String after) {
		this.before = before;
		this.after = after;
		potato = new Potato();
	}

	@Override
	public void consume() {
		System.out.println("---Before consume: " + before);
		potato.consume();
		System.out.println("---After consume: " + after);
	}

	@Override
	public void wash() {
		System.out.println("---Before wash: " + before);
		potato.wash();
		System.out.println("---After wash: " + after);

	}
}