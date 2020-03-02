package kail.study.java.woowa.lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LottoTest {
	@Test
	void 당첨_1등() {
		List<Integer> lotto = Arrays.asList(1,2,3,4,5,6);
		List<Integer> winningLotto = Arrays.asList(1,2,3,4,5,6);

		int matchOfCount = Lotto.match(lotto, winningLotto, 7);
		assertThat(matchOfCount).isEqualTo(1);
	}
}
