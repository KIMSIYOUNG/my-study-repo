package kail.study.java.racing.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RoundTest {
	@ParameterizedTest
	@ValueSource(strings = {"1", "30", "25", "12"})
	@DisplayName("1회~30회 사이의 라운드가 정상적으로 입력 된 경우")
	void correctRound(String round) {
		assertThat(new Round(round));
	}

	@ParameterizedTest
	@ValueSource(strings = {"-1", "0", "-3"})
	void smallerThanOne(String round) {
		assertThatThrownBy(() -> {
			new Round(round);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("플레이 할 라운드는 1~30");
	}

	@ParameterizedTest
	@ValueSource(strings = {"문자열은", "아니되오", "숫자로", "가자구"})
	void stringException(String round) {
		assertThatThrownBy(() -> {
			new Round(round);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("문자열은 입력 할 수 없습니다.");
	}

	@Test
	@DisplayName("reduce 메소드를 통해 라운드가 감소하는 지 테스트")
	void reduce() {
		Round round = new Round("2");
		round.reduce();
		round.reduce();
		assertThat(round.isEnd()).isTrue();
	}

	@Test
	@DisplayName("프로그램 오작동으로 라운드가 종료되었는데도, reduce를 호출하는 경우")
	void isEnd() {
		Round round = new Round("1");
		round.reduce();
		assertThatThrownBy(() -> {
			round.reduce();
		}).isInstanceOf(RuntimeException.class)
			.hasMessageContaining("모든 라운드가 종료되었습니다.");
	}
}
