package modern;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class NumberStreamExample {
	@Test
	void name() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Optional<Integer> reduce = list.stream().reduce(Integer::max);
		reduce.ifPresent(System.out::print);
	}
}
