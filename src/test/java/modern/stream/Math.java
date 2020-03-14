package modern.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class Math {
	@Test
	void fibonacci() {
		Stream.iterate(new int[]{0,1},
			t-> new int[]{t[1], t[0]+t[1]})
			.limit(20)
			.map(t->t[0])
			.forEach(System.out::println);
	}
}
