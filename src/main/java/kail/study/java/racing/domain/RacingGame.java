package kail.study.java.racing.domain;

import java.util.List;

import kail.study.java.racing.util.StringUtils;
import kail.study.java.racing.view.InputView;
import kail.study.java.racing.view.OutputView;

public class RacingGame {
	private RacingCars racingCars;
	private Round round;

	public void run() {
		initializeRace();
		playGame();
	}

	private void initializeRace() {
		try {
			List<String> carNames = StringUtils.parseByComma(InputView.getInput());
			racingCars = CarFactory.create(carNames);
			round = new Round(InputView.getTimes());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			initializeRace();
		}
	}

	private void playGame() {
		while (!round.isEnd()) {
			racingCars.move();
			OutputView.printRoundResult(racingCars.getCars());
			round.reduce();
		}
		OutputView.printWinner(racingCars.getWinner());
	}
}
