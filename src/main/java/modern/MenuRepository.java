package modern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MenuRepository {
	private static List<Dish> menu = new ArrayList<>();

	static {
		menu.add(new Dish("pork", false, 800, Type.MEAT));
		menu.add(new Dish("beef", false, 700, Type.MEAT));
		menu.add(new Dish("chicken", false, 400, Type.MEAT));
		menu.add(new Dish("french fries", true, 530, Type.OTHER));
		menu.add(new Dish("rice", true, 350, Type.OTHER));
		menu.add(new Dish("season fruit", true, 120, Type.OTHER));
		menu.add(new Dish("pizza", true, 550, Type.OTHER));
		menu.add(new Dish("prawns", false, 300, Type.FISH));
		menu.add(new Dish("salmon", false, 450, Type.FISH));
	}

	public static List<Dish> getMenu() {
		return Collections.unmodifiableList(menu);
	}
}
