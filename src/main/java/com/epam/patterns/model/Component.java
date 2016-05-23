package com.epam.patterns.model;

import java.util.List;

public class Component {
	private String name;
	private List<Component> components;

	public Component(String name) {
		this.name = name;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public String getName() {
		return name;
	}
}
