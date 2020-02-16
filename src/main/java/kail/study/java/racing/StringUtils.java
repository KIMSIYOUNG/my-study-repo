package kail.study.java.racing;

import java.util.Arrays;
import java.util.List;

public class StringUtils {
	public static List<String> parseByComma(String userInput) {
		return Arrays.asList(userInput.split(","));
	}
}
