package kail.study.java.objectsbook.movie.domain.discount.policy;

import kail.study.java.objectsbook.movie.domain.Money;
import kail.study.java.objectsbook.movie.domain.Screening;
import kail.study.java.objectsbook.movie.domain.discount.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
	private Money discountMoney;

	public AmountDiscountPolicy(Money discountMoney,
		DiscountCondition... conditions) {
		super(conditions);
		this.discountMoney = discountMoney;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountMoney;
	}
}
