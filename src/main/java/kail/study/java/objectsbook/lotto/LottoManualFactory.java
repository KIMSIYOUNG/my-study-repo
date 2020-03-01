package kail.study.java.objectsbook.lotto;

public class LottoManualFactory implements LottoFactory{
	@Override
	public Lotto create() {
		return new Lotto();
	}
}
