package com.epam.patterns.facade;

import com.epam.patterns.model.Beef;
import com.epam.patterns.model.Chicken;
import com.epam.patterns.model.Meat;
import com.epam.patterns.model.Pork;

public class MeatFacade {
	private Meat beef;
	private Meat chicken;
	private Meat pork;

	public MeatFacade() {
		init();
	}

	private void init() {
		beef = new Beef();
		chicken = new Chicken();
		pork = new Pork();
	}

	public void consumeBeef() {
		beef.consume();
	}

	public void fryBeef() {
		beef.fry();
	}

	public void consumeChicken() {
		chicken.consume();
	}

	public void fryChicken() {
		chicken.fry();
	}

	public void consumePork() {
		pork.consume();
	}

	public void fryPork() {
		pork.fry();
	}
}
