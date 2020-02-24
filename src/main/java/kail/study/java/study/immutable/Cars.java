package kail.study.java.study.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = new ArrayList<>(cars);
	}

	public List<Car> getCars() {
		return Collections.unmodifiableList(cars);
	}

	public static void main(String[] args) {
		List<Car> carNames = new ArrayList<>();
		carNames.add(new Car("hodol"));
		Cars cars = new Cars(carNames);

		List<Car> anotherCars = new ArrayList<>(cars.getCars());
		List<Car> cars1 = cars.getCars();

		anotherCars.add(new Car("pobi"));
		cars1.add(new Car("pobi"));
	}
}
