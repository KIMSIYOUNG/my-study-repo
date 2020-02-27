package kail.study.java.solid.dip;

public class Main {
	public static void main(String[] args) {
		Kid kid = new Kid();
		kid.setToy(new Lego());
		kid.play();
	}
}
