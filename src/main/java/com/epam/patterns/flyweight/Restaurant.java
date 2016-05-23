package com.epam.patterns.flyweight;

import java.util.HashMap;

import com.epam.patterns.model.Beef;
import com.epam.patterns.model.Lunch;

public class Restaurant {
	private static final HashMap<String, Lunch> lunches = new HashMap<>();

	public static Lunch getLunch(String type) {
		Lunch lunch = lunches.get(type);

		if (lunch == null) {
			lunch = new Lunch(5, new Beef(), null);
			lunches.put(type, lunch);
		}
		return lunch;
	}
}
