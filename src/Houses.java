import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[] args) {
	String color;
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.penUp();
		Tortoise.move(-130);
		Tortoise.turn(270);
		Tortoise.move(230);
		Tortoise.turn(90);
		Tortoise.penDown();
	
		 for (int i = 0; i < 10; i++) {
			 int s = new Random().nextInt(9);
		
		 if(s == 0){
			 drawcolor("red");
				
				drawHouse("small");
		 }
		 else if(s == 1){
			 drawcolor("magenta");
				drawroofs("large"); 
		 }
 else if(s == 2){
	 drawcolor("green");
		drawHouse("medium"); 
		 }
 else if(s == 3){
	 drawHouse("medium");
		drawcolor("magenta"); 
 }
 else if(s == 4){
	 drawHouse("small");
		drawcolor("red"); 
 }
 else if(s == 5){
		drawHouse("medium");
		drawcolor("green");
 } 
 
 else if(s == 6){
	 drawroofs("medium");
		drawcolor("magenta"); 
 }
 else if(s == 7){
	 drawroofs("small");
		drawcolor("red"); 
 }
 else if(s == 8){
		drawroofs("medium");
		drawcolor("green");
 } 

		 }
		 
		
		
		
		
	
	
		
	
		
		
	
}
private static void drawroofs(String roof) {
	int a = 1;

	 int s = new Random().nextInt(3);
	 
		
	
	if(roof.equals("small")){
		a = 60;
	}
	else if(roof.equals("medium")){
	a = 120;	
	}
	else{
	a = 250;
	}
	
	Tortoise.move(a);
	Tortoise.turn(90);
	
	Tortoise.move(30);
	Tortoise.turn(90);
	Tortoise.move(a);
	Tortoise.turn(270);
	Tortoise.setPenColor(Color.GREEN);
	Tortoise.move(20);
	Tortoise.turn(270);
	
}

private static void drawcolor(String color) {

	if(color.equals("red")){
		Tortoise.setPenColor(Color.red);
	}
	else if(color.equals("green")){
		Tortoise.setPenColor(Color.green);
	}
	else if(color.equals("magenta")){
		Tortoise.setPenColor(Color.MAGENTA);
	}
	
	
}
private static void drawHouse(String height) {

	int i = 1;

		
		
	
	if(height.equals("small")){
		i = 60;
	}
	else if(height.equals("medium")){
	i = 120;	
	}
	else{
	i = 250;
	}
	
	
	Tortoise.move(i);
	Tortoise.turn(45);
	Tortoise.move(20);
	Tortoise.turn(90);
	Tortoise.move(20);
	Tortoise.turn(45);
	Tortoise.move(i);
	Tortoise.turn(270);
	Tortoise.setPenColor(Color.GREEN);
	Tortoise.move(20);
	Tortoise.turn(270);
	}
	
}

