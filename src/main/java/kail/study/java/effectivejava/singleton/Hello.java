package kail.study.java.effectivejava.singleton;

import java.util.Collections;

public class Hello {
	private static final Hello single = new Hello();

	private Hello() {
		Collections
	}

	public static Hello getInstance() {
		return single;
	}
}
