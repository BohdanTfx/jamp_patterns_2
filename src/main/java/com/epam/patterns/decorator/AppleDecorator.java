package com.epam.patterns.decorator;

import com.epam.patterns.model.Apple;
import com.epam.patterns.model.Plant;

public class AppleDecorator implements Plant {
	private Apple apple;
	
	public AppleDecorator() {
		apple = new Apple();
	}

	public void consume() {
		apple.consume();
	}

	public void wash() {
		apple.wash();
	}

	public void cut() {
		System.out.println("---Apple cutting---");
	}
}
