package kail.study.java.racing.util;

import java.util.Arrays;
import java.util.List;

public class StringUtils {
	public static List<String> parseByComma(String userInput) {
		return Arrays.asList(userInput.split(","));
	}

	public static String printHyphen(int position) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < position; i++) {
			sb.append("-");
		}
		return sb.toString();

	}
}
