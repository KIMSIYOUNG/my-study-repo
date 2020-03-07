package kail.study.java.enumStudy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public enum Number {
	AVG("평균", list -> {
		return getSum(list) / list.size();
	}),
	SUM("합계", list -> {
		return getSum(list);
	});

	private static Integer getSum(List<Integer> list) {
		return list.stream()
			.reduce(Integer::sum)
			.get();
	}

	private final String name;
	private final Function<List<Integer>, Integer> expression;

	Number(String name, Function<List<Integer>, Integer> expression) {
		this.name = name;
		this.expression = expression;
	}

	public Integer calculate(List<Integer> list) {
		return expression.apply(list);
	}

	public static void main(String[] args) {
		System.out.println(Number.AVG.calculate(Arrays.asList(1, 2, 3, 4, 5)));
		System.out.println(Number.SUM.calculate(Arrays.asList(1, 2, 3, 4, 5)));
	}
}
