package kail.study.java.racing.util;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kail.study.java.racing.util.StringUtils;

public class UserInputTest {
	@Test
	@DisplayName("올바르게 ,를 구분으로 입력하는 경우")
	void splitTest() {
		List<String> names = StringUtils.parseByComma("pobi,hodol,kyle");
		assertThat(names).containsExactly("pobi", "hodol", "kyle");
		assertThat(names).hasSize(3);
	}
}
