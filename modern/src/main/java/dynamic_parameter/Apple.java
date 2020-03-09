package dynamic_parameter;

public class Apple {
	private final String name;
	private final Color color;
	private final int weight;

	public Apple(String name, Color color, int weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
}
