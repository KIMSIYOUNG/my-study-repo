package modern;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

import org.junit.jupiter.api.Test;

public class DishTest {
	List<Dish> dishes = MenuRepository.getMenu();

	@Test
	void test() {
		Map<Type, List<String>> collect = dishes.stream()
			.collect(groupingBy(Dish::getType,
				mapping(Dish::getName, toList())));
		System.out.println(collect);

		Map<Boolean, Map<Type, List<Dish>>> collect1 = dishes.stream()
			.collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
		System.out.println(collect1);
	}

	@Test
	void nullTest() {
		BiFunction<Integer, Integer, Integer> function = (a,b) -> a+b;
		Objects.requireNonNull(function);
		Objects.isNull(function.apply(null, 3));
	}

}