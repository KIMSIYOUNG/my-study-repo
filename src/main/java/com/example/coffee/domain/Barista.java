package com.example.coffee.domain;

public class Barista {
	public Coffee makeCoffee(MenuItem menuItem) {
		return new Coffee(menuItem);
	}
}
