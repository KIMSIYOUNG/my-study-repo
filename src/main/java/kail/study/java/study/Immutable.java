package kail.study.java.study;

public class Immutable {
	private final StringBuilder sb;

	public Immutable(StringBuilder sb) {
		this.sb = sb;
	}

	public StringBuilder getSb() {
		return sb;
	}
}
