package April2017;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Projectile extends GameObject {
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	int speed = 10;

	Projectile(int x, int y, int width, int height) {

		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void update() {
		super.update();
		y -= speed;
		if (y < 0) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.bulletImg, x, y, width, height, null);
	}
}
