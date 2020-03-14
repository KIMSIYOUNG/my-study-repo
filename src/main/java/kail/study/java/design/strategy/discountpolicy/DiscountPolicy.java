package kail.study.java.design.strategy.discountpolicy;

import kail.study.java.design.strategy.Item;

public interface DiscountPolicy {
	double calculateWithDisCountRate(Item item);
}
