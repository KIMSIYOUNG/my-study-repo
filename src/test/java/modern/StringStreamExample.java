package modern;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class StringStreamExample {
	@Test
	void name() {
		List<String> hello = Arrays.asList("Hello", "World");

		List<String> result = hello.stream()
			.map(s -> s.split(""))
			.flatMap(Arrays::stream)
			.map(String::toUpperCase)
			.distinct()
			.collect(Collectors.toList());

		assertThat(result).containsExactly("H","E","L","O","W","R","D");
	}

	@Test
	void multiply() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);

		List<Integer> result = numbers.stream()
			.map(number -> number * number)
			.collect(Collectors.toList());

		assertThat(result).containsExactly(1,4,9,16,25);
	}

	@Test
	void couple() {
		List<Integer> first = Arrays.asList(1,2,3);
		List<Integer> second = Arrays.asList(4,5);

		List<int[]> collect = first.stream()
			.flatMap(number1 ->
				second.stream()
					.map(number2 -> new int[] {number1, number2}))
			.collect(Collectors.toList());

		assertThat(collect).contains(new int[]{1,4}, new int[]{3,4});
	}

	@Test
	void divideByThree() {
		List<Integer> first = Arrays.asList(1,2,3);
		List<Integer> second = Arrays.asList(4,5);

		List<int[]> collect = first.stream()
			.flatMap(number1 ->
				second.stream()
					.filter(number2 -> (number1 + number2) % 3 == 0)
					.map(number2 -> new int[] {number1, number2}))
			.collect(Collectors.toList());

		assertThat(collect).contains(new int[]{1,5}, new int[]{2,4});
	}
}
