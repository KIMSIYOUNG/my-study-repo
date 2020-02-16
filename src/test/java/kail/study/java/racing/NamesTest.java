package kail.study.java.racing;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class NamesTest {
	@Test
	void 중복된_이름 () {
		List<Name> names = new ArrayList<>();
		names.add(new Name("pobi"));
		names.add(new Name("pobi"));
		assertThatThrownBy(()->{
			new Names(names);
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("중복된 이름이 존재합니다.");
	}
}