package kail.study.java.design.strategy.discountpolicy;

import kail.study.java.design.strategy.Item;

public class UnFreshFruitDiscount implements DiscountPolicy{
	@Override
	public double calculateWithDisCountRate(Item item) {
		return item.getPrice() * 0.8;
	}
}
