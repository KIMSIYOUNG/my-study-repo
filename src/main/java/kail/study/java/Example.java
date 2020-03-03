package kail.study.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		String[] str = new String[] {"pobi", "dd", "kyle"};
		for (String s : str) {
			s = s.replaceAll(s, "hello");
			System.out.println(s);
		}
		System.out.println(Arrays.toString(str));

		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].replaceAll(str[i], "hello");
		}
		System.out.println(Arrays.toString(str));

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");

		// int size = list.size();
		// for (int i = 0; i < size; i++) {
		// 	list.remove(i);
		// 	System.out.println(list.toString());
		// }
		System.out.println(list.toString());
	}
}
