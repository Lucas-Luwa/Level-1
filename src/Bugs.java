import java.awt.Color;
import java.util.Random;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
public class Bugs {
public static void main(String[] args) {
	World big = new World();
	big.show();
	Bug red = new Bug();
	int a = -1;
	int b = -1;
	
	for (int i = 0; i < 10; i++) {
	a+=1;
	b+=1;
	Location X = new Location(a,b);
	big.add(X, red);
	}
	int c = 10;
	int d = -1;
	
	for (int i = 0; i < 10; i++) {
	c-=1;
	d+=1;
	Location X = new Location(c,d);
	big.add(X, red);
	}
}
}
