package kail.study.java.objectsbook.type.monster;

public class Monster {
	private int health;
	private Breed breed;

	public Monster(Breed breed) {
		this.health = breed.getHealth();
		this.breed = breed;
	}

	public int getHealth() {
		return health;
	}

	public String getAttack() {
		return breed.getAttack();
	}
}
