package kail.study.java.design.single;

public class FakePrinter implements Printer {
	private String str;

	public void print(String str) {
		this.str = str;
	}

	public String get() {
		return str;
	}
}
