package April2017;

import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;

	void update() {
		for (int i = 0; i < 15; i++) {
			x += 2;// Move for no reason!
		}
	}

	void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}

	
}
