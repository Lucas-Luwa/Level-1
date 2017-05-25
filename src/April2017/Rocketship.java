package April2017;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;

	Rocketship(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		speed = 3;
	}

	void update() {
		super.update();
		if (left) {
			x -= speed;
		}
		if (right) {
			x += speed;
		}
		if (up) {
			y -= speed;
		}
		if (down) {
			y += speed;
		}
		if (x >= 450) {
			x = 450;
		} else if (x <= 0) {
			x = 0; 
		} else if (y >= 730) {
			y = 730;
		} else if (y <= 0) {
			y = 0;
		}
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}

	void left() {
		x += 10;
	}

	void Right() {
		x -= 10;
	}

	void Up() {
		y += 10;
	}

	void Down() {
		y -= 10;
	}

}
