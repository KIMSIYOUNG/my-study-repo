package kail.study.java.objectsbook.type.game;

import java.awt.*;

public class Monster implements Collidable {
	@Override
	public boolean collideWith(Collidable other) {
		return false;
	}

	@Override
	public Point getPosition() {
		return null;
	}

	@Override
	public void update(Graphics graphics) {

	}

	@Override
	public String getName() {
		return null;
	}
}