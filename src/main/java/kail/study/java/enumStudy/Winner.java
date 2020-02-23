package kail.study.java.enumStudy;

import java.util.Arrays;
import java.util.List;

public enum  Winner {
	WINNER("승리", Arrays.asList("kyle","pobi","hello","world")),
	LOSER("패배", Arrays.asList("hodol","dunddoung","rutgo"));

	private final String winner;
	private final List<String> list;

	Winner(String winner, List<String> list) {
		this.winner = winner;
		this.list = list;
	}

	public boolean isWinner(String name) {
		return WINNER.list.contains(name);
	}

	public int getWinnerSize() {
		return WINNER.list.size();
	}
}
