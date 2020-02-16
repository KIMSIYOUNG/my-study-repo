package kail.study.java.racing;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RacingCars {
	private final List<Car> cars;

	public RacingCars(List<Car> cars) {
		validate(cars);
		this.cars = cars;
	}

	private void validate(List<Car> names) {
		checkDuplication(names);
	}

	private void checkDuplication(List<Car> names) {
		Set<Car> set = names.stream().collect(Collectors.toSet());
		if(set.size() != names.size())
			throw new IllegalArgumentException("중복된 이름이 존재합니다.");
	}
}
