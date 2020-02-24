package kail.study.java.enumStudy;

public enum Standard {
	PASS("Y", true, "1"),
	FAIL("N", false, "0");

	private final String expression1;
	private final boolean expression2;
	private final String expression3;

	Standard(String expression1, boolean expression2, String expression3) {
		this.expression1 = expression1;
		this.expression2 = expression2;
		this.expression3 = expression3;
	}
}
