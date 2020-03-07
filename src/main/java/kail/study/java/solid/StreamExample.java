package kail.study.java.solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"a", "b", "c"});
		Set<String> set = list.stream().filter(e -> e.contains("a")).collect(Collectors.toSet());
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
