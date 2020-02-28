package kail.study.java.objectsbook.movie.domain.discount.policy;

import kail.study.java.objectsbook.movie.domain.Money;
import kail.study.java.objectsbook.movie.domain.Screening;

public interface DiscountPolicy {
	Money calculateDiscountAmount(Screening screening);
}
