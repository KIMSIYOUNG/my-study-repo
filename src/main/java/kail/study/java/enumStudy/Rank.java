package kail.study.java.enumStudy;

import java.util.Arrays;

public enum Rank {
	THREE("셋", 3, 4_000),
	FOUR("넷", 4, 10_000),
	FIVE("다섯", 5, 30_000);

	private final String name;
	private final int match;
	private final int money;
	private int count;

	Rank(String name, int match, int money) {
		this.name = name;
		this.match = match;
		this.money = money;
	}

	public void plusCount() {
		this.count++;
	}

	public void of(String anotherName) {
		Arrays.stream(values())
			.filter(name -> name.equals(anotherName))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException());
	}

	public static void main(String[] args) {

	}
}
