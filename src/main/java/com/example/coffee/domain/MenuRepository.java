package com.example.coffee.domain;

import java.util.Collections;
import java.util.List;

public class MenuRepository {
	private static List<MenuItem> menus;

	static {
		menus.add(new MenuItem("아메리카노",3000));
		menus.add(new MenuItem("카페라떼",3500));
		menus.add(new MenuItem("돌체라떼",4000));
		menus.add(new MenuItem("꿀아메리카노",3500));
		menus.add(new MenuItem("딸기라떼",4000));
	}

	public static List<MenuItem> create() {
		return Collections.unmodifiableList(menus);
	}
}
