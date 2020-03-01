package kail.study.java.objectsbook.lotto;

public class Main {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.create(new LottoAutoFactory());
		lotto.setFactory(new LottoManualFactory());
	}
}
