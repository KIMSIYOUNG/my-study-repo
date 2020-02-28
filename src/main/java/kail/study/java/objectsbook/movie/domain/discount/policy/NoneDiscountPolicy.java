package kail.study.java.objectsbook.movie.domain.discount.policy;

import kail.study.java.objectsbook.movie.domain.Money;
import kail.study.java.objectsbook.movie.domain.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
	@Override
	public Money calculateDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
