package kail.study.java.racing;

public class Name {
	public static final int MAX_LENGTH = 5;

	private final String name;

	public Name(String name) {
		validate(name);
		this.name = name;
	}

	private void validate(String name) {
		checkLength(name);
	}

	private void checkLength(String name) {
		if (name.length() > MAX_LENGTH)
			throw new IllegalArgumentException("길이가 초과되었습니다.");
	}
}





