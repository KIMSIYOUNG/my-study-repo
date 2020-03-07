package kail.study.java.objectsbook.lotto;

public class LottoAutoFactory implements LottoFactory {
	@Override
	public Lotto create() {
		return new Lotto();
	}
}
