import org.junit.Test;

public class HashEqualTest {
	@Test
	public void name() {
		HashEqual hashEqual = new HashEqual(, 2, "sd");
		HashEqual hashEqual2 = new HashEqual(, 1, "ss");
		System.out.println(hashEqual.hashCode());
		System.out.println(hashEqual2.hashCode());
	}
}