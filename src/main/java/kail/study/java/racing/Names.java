package kail.study.java.racing;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Names {
	private final List<Name> names;

	public Names(List<Name> names) {
		validate(names);
		this.names = names;
	}

	private void validate(List<Name> names) {
		checkDuplication(names);
	}

	private void checkDuplication(List<Name> names) {
		Set<Name> set = names.stream().collect(Collectors.toSet());
		if(set.size() != names.size())
			throw new IllegalArgumentException("중복된 이름이 존재합니다.");
	}
}

