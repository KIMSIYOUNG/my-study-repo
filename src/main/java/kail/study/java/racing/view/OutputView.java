package kail.study.java.racing.view;

import java.util.List;
import java.util.stream.Collectors;

import kail.study.java.racing.domain.Car;
import kail.study.java.racing.util.StringUtils;

public class OutputView {
	public static void printRoundResult(List<Car> cars) {
		System.out.println("실행 결과");
		for (Car car : cars) {
			System.out.println(car.getName() + " : "
				+ StringUtils.printHyphen(car.getPosition()));
		}
	}

	public static void printWinner(List<Car> winner) {
		String winnerNames = winner.stream()
			.map(Car::getName)
			.collect(Collectors.joining(", "));
		System.out.println(String.format("우승자는 %s입니다", winnerNames));
	}
}
