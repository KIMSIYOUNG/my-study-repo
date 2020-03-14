package modern.stream;


import static java.util.stream.Collectors.*;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TraderTest {
	Trader raoul = new Trader("Raoul", "Cambridge");
	Trader mario = new Trader("Mario", "Milan");
	Trader alan = new Trader("Alan", "Cambridge");
	Trader brian = new Trader("Brian", "Cambridge");

	List<Transaction> transactions = Arrays.asList(
		new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 700),
		new Transaction(mario, 2012, 720),
		new Transaction(alan, 2012, 950)
	);

	@Test
	@DisplayName("2011년에 일어난 모든 트랙잭션 값을 찾아 오름차순 정렬")
	void ascending() {
		List<Transaction> collect = transactions.stream()
			.filter(transaction -> transaction.getYear() == 2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.collect(Collectors.toList());
		assertThat(collect.get(0).getValue()).isEqualTo(300);
	}

	@Test
	@DisplayName("케임브리지에 거주하는 모든 트랜잭션의 합을 출력하시오." )
	void sumOfCambridge() {
		Integer sumOfCambridge = transactions.stream()
			.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
			.map(Transaction::getValue)
			.reduce(0, Integer::sum);
		assertThat(sumOfCambridge).isEqualTo(2650);
		System.out.println(sumOfCambridge);
	}

	@Test
	@DisplayName("밀라노에 거래자가 있는가?")
	void hasMilan() {
		boolean any = transactions.stream()
			.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		assertThat(any).isTrue();
	}

	@Test
	@DisplayName("밀라노에 거래자가 있는가?")
	void nameAscending() {
		//TODO 모든 거래자의 이름을 알파벳 순서로 정렬해서 반환하세요.
		List<String> namesBro = transactions.stream()
			.map(transaction -> transaction.getTrader().getName())
			.sorted(String::compareTo)
			.distinct()
			.collect(Collectors.toList());
		assertThat(namesBro).containsExactly("Alan","Brian","Mario","Raoul");
	}

	@Test
	@DisplayName("케임브리지에서 근무하는 모든 거래자를 찾아 이름순으로 정렬")
	void cambridge() {
		List<Trader> traders = transactions.stream()
			.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
			.map(Transaction::getTrader)
			.sorted(Comparator.comparing(Trader::getName))
			.collect(Collectors.toList());
		assertThat(traders.get(0).getName()).isEqualTo("Alan");
	}

	@Test
	@DisplayName("거래처가 근무하는 모든 도시를 중복없이 나열하시오.")
	void city() {
		List<String> cities = transactions.stream()
			.map(transaction -> transaction.getTrader().getCity())
			.distinct()
			.collect(Collectors.toList());
		assertThat(cities).containsExactly("Cambridge", "Milan");
	}

	@Test
	@DisplayName("최소값 입니더")
	void getMinTransaction() {
		int min = transactions.stream()
			.mapToInt(Transaction::getValue)
			.min()
			.orElse(0);
		assertThat(min).isEqualTo(300);
		System.out.println(min);
	}

	@Test
	@DisplayName("최대값 트랜잭션")
	void getMaxTransaction() {
		int max = transactions.stream()
			.mapToInt(Transaction::getValue)
			.max()
			.orElse(0);
		assertThat(max).isEqualTo(1000);
		System.out.println(max);
	}

	@Test
	@DisplayName("이름별로 분류")
	void transactionByCountry() {
		Map<String, List<Trader>> collect = transactions.stream()
			.map(transaction -> transaction.getTrader())
			.collect(groupingBy(Trader::getName));
		System.out.println(collect);
	}
}