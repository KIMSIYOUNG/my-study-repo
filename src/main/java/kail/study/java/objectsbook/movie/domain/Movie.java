package kail.study.java.objectsbook.movie.domain;

import java.time.Duration;

import kail.study.java.objectsbook.movie.domain.discount.policy.DefaultDiscountPolicy;
import kail.study.java.objectsbook.movie.domain.discount.policy.DiscountPolicy;

public class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	private DiscountPolicy discountPolicy;

	public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy discountPolicy) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountPolicy = discountPolicy;
	}

	public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}

	public Money getFee() {
		return fee;
	}

	public Money calculateMovieFee(Screening screening) {
		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}
}