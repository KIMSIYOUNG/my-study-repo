package kail.study.java.design.single;

public class RealPrinter implements Printer {
	private static Printer printer = null;

	private RealPrinter() {
	}

	public synchronized static Printer getInstance() {
		if (printer == null)
			printer = new RealPrinter();
		return printer;
	}

	@Override
	public void print(String input) {
		System.out.println(input);
	}
}
