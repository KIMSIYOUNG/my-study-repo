import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class HashEqual {
	private final List<Integer> list;
	private final int age;
	private final String name;

	public HashEqual(List<Integer> list, int age, String name) {
		this.list = list;
		this.age = age;
		this.name = name;
	}

	public List<Integer> getList() {
		return Collections.unmodifiableList(list);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		HashEqual hashEqual = (HashEqual)o;
		return age == hashEqual.age &&
			Objects.equals(name, hashEqual.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
}
