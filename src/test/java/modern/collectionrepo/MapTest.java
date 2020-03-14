package modern.collectionrepo;

import static java.util.Map.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class MapTest {
	@Test
	void mapTest() {
		Map<String, String> mapExample = Map.ofEntries(
			entry("Hello", "World"),
			entry("Abc", "Def"));
		mapExample.replaceAll((key,value) -> key.toUpperCase());
		mapExample.replace("Hello", "hi");
		mapExample.merge()

		mapExample.entrySet()
			.stream()
			.sorted(Entry.comparingByKey())
			.forEachOrdered(System.out::println);
	}
}
