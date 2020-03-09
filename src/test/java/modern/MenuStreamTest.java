package modern;


import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class MenuStreamTest {
	private static final List<Dish> dishes = MenuRepository.getMenu();

	@Test
	void name() {
		List<String> result = dishes.stream()
			.filter(dish -> dish.getCalories() > 300)
			.map(Dish::getName)
			.limit(3)
			.collect(Collectors.toList());
		assertThat(result).containsExactly("pork", "beef","chicken");
	}

	@Test
	void dishCount() {
		Optional<Integer> reduce = dishes.stream()
			.map(dish -> 1)
			.reduce(Integer::sum);
		assertThat(reduce.get()).isEqualTo(dishes.size());
	}

	@Test
	void printTest() {
		List<String> result = dishes.stream()
			.filter(dish -> {
				System.out.println("filtering : " + dish.getName());
				return dish.getCalories() > 300;
			})
			.map(Dish::getName)
			.limit(3)
			.collect(Collectors.toList());
		assertThat(result).containsExactly("pork", "beef","chicken");
	}
}