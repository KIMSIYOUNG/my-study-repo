package dynamic_parameter;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppleTest {
	@Test
	public void name() {
		List<Apple> inventory = Arrays.asList(
			new Apple("coffee",Color.RED,160),
			new Apple("coffee",Color.RED,170)
		);
		inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
		assertEquals(inventory.get(0).getWeight(), 170);
	}
}