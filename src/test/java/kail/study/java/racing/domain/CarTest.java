package kail.study.java.racing.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import kail.study.java.racing.domain.Car;

public class CarTest {
	@ParameterizedTest
	@ValueSource(strings = {"kyle", "hodle", "pobi"})
	@DisplayName("이름 규칙에 문제가 없어서 정상적으로 생성되는 경우")
	void 정상적인_경우(String name) {
		assertThat(new Car(name));
	}

	@ParameterizedTest
	@ValueSource(strings = {"overLength", "helloWorld", "ImTheKing"})
	void 길이_초과(String name) {
		assertThatThrownBy(() -> {
			new Car(name);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("길이가 초과");
	}

	@ParameterizedTest
	@ValueSource(strings = {"", "   ", "            "})
	void 공백_예외(String name) {
		assertThatThrownBy(() -> {
			new Car(name);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("공백은 입력할 수 없습니다.");
	}

	@Test
	void 널이라서_예외() {
		assertThatThrownBy(() -> {
			new Car(null);
		}).isInstanceOf(NullPointerException.class)
			.hasMessageContaining("널값은 입력할 수 없습니다.");
	}

}
