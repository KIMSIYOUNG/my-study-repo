package dynamic_parameter;

import java.util.ArrayList;
import java.util.List;

public class FruitFormatter {

	public static List<Apple> filterByGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(Color.GREEN.equals(apple.getColor()))
				result.add(apple);
		}
		return result;
	}

	public static List<Apple> filterByWeight(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(apple.getWeight() > 150)
				result.add(apple);
		}
		return result;
	}
}
