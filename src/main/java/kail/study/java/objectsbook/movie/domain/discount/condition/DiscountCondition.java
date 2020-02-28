package kail.study.java.objectsbook.movie.domain.discount.condition;

import kail.study.java.objectsbook.movie.domain.Screening;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
