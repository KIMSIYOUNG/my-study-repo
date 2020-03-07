package com.example.coffee.domain;

public class MenuItem {
	private final String name;
	private final int price;

	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
}
