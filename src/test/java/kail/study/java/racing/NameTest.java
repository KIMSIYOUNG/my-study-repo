package kail.study.java.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {
	@ParameterizedTest
	@ValueSource(strings = {"kyle", "hodle", "pobi"})
	@DisplayName("이름 규칙에 문제가 없어서 정상적으로 생성되는 경우")
	void 정상적인_경우(String name) {
		assertThat(new Name(name));
	}

	@ParameterizedTest
	@ValueSource(strings = {"overLength", "helloWorld", "ImTheKing"})
	void 길이_초과(String name) {
		assertThatThrownBy(() -> {
			new Name(name);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("길이가 초과");
	}
}
