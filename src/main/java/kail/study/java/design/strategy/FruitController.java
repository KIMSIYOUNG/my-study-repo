package kail.study.java.design.strategy;

import java.util.Arrays;

import kail.study.java.design.strategy.discountpolicy.FirstCustomerDiscount;

public class FruitController {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(new FirstCustomerDiscount());
		calculator.calculate(Arrays.asList(
			new Item("Apple", 3000),
			new Item("Banana", 3000),
			new Item("Orange", 2000),
			new Item("Pitch", 4000)
		));
	}
}
