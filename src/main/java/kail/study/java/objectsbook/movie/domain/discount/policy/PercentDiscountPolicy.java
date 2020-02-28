package kail.study.java.objectsbook.movie.domain.discount.policy;

import kail.study.java.objectsbook.movie.domain.Money;
import kail.study.java.objectsbook.movie.domain.Screening;
import kail.study.java.objectsbook.movie.domain.discount.condition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
	private double percent;

	public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
