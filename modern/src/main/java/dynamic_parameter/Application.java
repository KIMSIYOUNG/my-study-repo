package dynamic_parameter;

import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple("apple",Color.GREEN, 170),
			new Apple("banana",Color.RED, 150));
		List<Apple> apples = FruitFormatter.format(
			inventory, (Apple apple) ->
				Color.RED.equals(apple.getColor()));
	}
}
