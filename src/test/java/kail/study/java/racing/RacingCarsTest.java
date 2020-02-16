package kail.study.java.racing;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RacingCarsTest {
	@Test
	void 중복된_이름_테스트() {
		List<Car> names = new ArrayList<>();
		names.add(new Car("pobi"));
		names.add(new Car("pobi"));
		assertThatThrownBy(()->{
			new RacingCars(names);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("중복된 이름이 존재합니다.");
	}
}
