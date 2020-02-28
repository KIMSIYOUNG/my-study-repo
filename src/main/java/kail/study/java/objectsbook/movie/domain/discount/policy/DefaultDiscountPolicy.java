package kail.study.java.objectsbook.movie.domain.discount.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kail.study.java.objectsbook.movie.domain.Money;
import kail.study.java.objectsbook.movie.domain.Screening;
import kail.study.java.objectsbook.movie.domain.discount.condition.DiscountCondition;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{
	private List<DiscountCondition> conditions = new ArrayList<>();

	public DefaultDiscountPolicy(DiscountCondition ... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	public Money calculateDiscountAmount(Screening screening) {
		for(DiscountCondition each : conditions) {
			if(each.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}
		return Money.ZERO;
	}

	abstract protected Money getDiscountAmount(Screening screening);
}
