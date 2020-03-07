package kail.study.java.enumStudy;

import java.util.function.BiFunction;

public enum Operator {
	PLUS("더하기", (a, b) -> (a + b)),
	MINUS("빼기", (a, b) -> (a - b)),
	MULTIPLY("곱하기", (a, b) -> (a * b)),
	DIVIDE("나누기", (a, b) -> (a / b));

	private final String name;
	private final BiFunction<Double, Double, Double> biFunction;

	Operator(String name, BiFunction<Double, Double, Double> biFunction) {
		this.name = name;
		this.biFunction = biFunction;
	}

	public Double calculate(double a, double b) {
		return this.biFunction.apply(a, b);
	}
}
