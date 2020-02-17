package kail.study.java.racing;

import kail.study.java.racing.util.StringUtils;
import kail.study.java.racing.view.InputView;

public class RacingGame {
	public void run() {
		StringUtils.parseByComma(InputView.getInput());
	}
}
