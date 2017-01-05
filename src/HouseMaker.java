import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseMaker {
	String size;
	Robot R2D2 = new Robot();

	int height = 0;
	int r;
	int g;
	int b;
	int turn1;
	int turn2;
	int forward;

	void SetRobotInCorner() {
		R2D2.setX(50);
		R2D2.setY(870);
		R2D2.turn(90);
	}

	void DrawAHouse() {
		R2D2.setSpeed(10);
		R2D2.penDown();
		R2D2.setPenColor(Color.GREEN);
		R2D2.move(50);
		R2D2.turn(-90);
		R2D2.setPenColor(r, g, b);
		R2D2.move(height);
		R2D2.turn(turn1);
		R2D2.move(forward);
		R2D2.turn(turn2);
		R2D2.move(forward);
		R2D2.turn(turn1);
		R2D2.move(height);
		R2D2.turn(-90);
		R2D2.setPenColor(Color.GREEN);
		R2D2.move(10);
	}

	void DrawNoRoofHouse() {
		R2D2.setSpeed(10);
		R2D2.penDown();
		R2D2.setPenColor(Color.GREEN);
		R2D2.move(50);
		R2D2.turn(-90);
		R2D2.setPenColor(r, g, b);
		R2D2.move(height);
		R2D2.turn(turn1);
		R2D2.penUp();
		R2D2.move(forward);
		R2D2.turn(turn2);
		R2D2.move(forward);
		R2D2.turn(turn1);
		R2D2.penDown();
		R2D2.move(height);
		R2D2.turn(-90);
		R2D2.setPenColor(Color.GREEN);
		R2D2.move(10);
	}

	void SetHeightOfHouse(String size) {
		if (size == "small") {
			height = 60;
		}
		if (size == "medium") {
			height = 120;
		}
		if (size == "large") {
			height = 250;
			turn1 = 90;
			turn2 = 0;
			forward = 15;
		}

	}

	void SetColorOfHouse(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	void DrawPointyRoof() {
		turn1 = 45;
		turn2 = 90;
		forward = 20;

	}

	void DrawFlatRoof() {
		turn1 = 90;
		turn2 = 0;
		forward = 15;
	}
}
