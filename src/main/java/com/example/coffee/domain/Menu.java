package com.example.coffee.domain;

import java.util.List;

public class Menu {
	private List<MenuItem> menus = MenuRepository.create();

	public MenuItem choose(String menuName) {
		return menus.stream()
			.filter(menuItem -> menuItem.getName().equals(menuName))
			.findFirst()
			.orElseThrow(IllegalArgumentException::new);
	}
}
