package kail.study.java.enumStudy;

public interface Calculator {
	int calculate(int a, int b);
}

class Plus implements Calculator {
	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
}

class Minus implements Calculator {
	@Override
	public int calculate(int a, int b) {
		return a - b;
	}
}

class Multiply implements Calculator {
	@Override
	public int calculate(int a, int b) {
		return a * b;
	}
}

class Divide implements Calculator {
	@Override
	public int calculate(int a, int b) {
		if (b == 0)
			throw new ArithmeticException();
		return a / b;
	}
}

