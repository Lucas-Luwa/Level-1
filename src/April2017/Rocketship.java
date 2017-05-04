package April2017;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	Rocketship(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		speed = 5;
	}

	void update() {
		super.update();
	}

	void draw(Graphics g) {
		//g.setColor(Color.BLUE);
		//g.fillRect(x, y, width, height);
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
