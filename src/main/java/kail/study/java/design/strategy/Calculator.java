package kail.study.java.design.strategy;

import java.util.List;

import kail.study.java.design.strategy.discountpolicy.DiscountPolicy;

public class Calculator {

	private final DiscountPolicy discountPolicy;

	public Calculator(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}

	public double calculate(List<Item> items) {
		double sum = 0;
		for (Item item : items) {
			sum += discountPolicy.calculateWithDisCountRate(item);
		}
		return sum;
	}
}
