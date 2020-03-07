package kail.study.java.woowa.lotto;

import java.util.List;

public class Lotto {
	public static int match(List<Integer> lotto, List<Integer> winningLotto, int bonusNo) {
		int matchOfAmount = match(lotto, winningLotto);
		return rank(matchOfAmount);
	}

	private static int rank(int matchOfAmount) {
		if (matchOfAmount == 6) {
			return 1;
		}
		return 0;
	}

	private static int match(List<Integer> lotto, List<Integer> winningLotto) {
		int matchOfAmount = 0;
		for (Integer lottoNumber : lotto) {
			if (winningLotto.contains(lottoNumber)) {
				matchOfAmount++;
			}
		}
		return matchOfAmount;
	}
}
