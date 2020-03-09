package dynamic_parameter;

import java.util.ArrayList;
import java.util.List;

public class FruitFormatter {

	public static List<Apple> format(List<Apple> apples, ApplePredicate predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : apples) {
			if(predicate.test(apple))
				result.add(apple);
		}
		return result;
	}
}
