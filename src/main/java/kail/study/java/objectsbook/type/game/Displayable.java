package kail.study.java.objectsbook.type.game;

import java.awt.*;

public interface Displayable extends GameObject {
	Point getPosition();
	void update(Graphics graphics);
}
