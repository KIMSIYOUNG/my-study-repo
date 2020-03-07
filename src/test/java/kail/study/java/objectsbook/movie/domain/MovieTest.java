package kail.study.java.objectsbook.movie.domain;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import kail.study.java.objectsbook.movie.domain.discount.policy.AmountDiscountPolicy;
import kail.study.java.objectsbook.movie.domain.discount.condition.PeriodCondition;
import kail.study.java.objectsbook.movie.domain.discount.condition.SequenceCondition;

class MovieTest {
	@Test
	void createTest() {
		Movie avatar = new Movie("아바타",
			Duration.ofMinutes(120),
			Money.wons(10000),
			new AmountDiscountPolicy(Money.wons(800),
				new SequenceCondition(1),
				new SequenceCondition(10),
				new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
				new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))));
	}
}