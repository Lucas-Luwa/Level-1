import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		
	
	int c = new Random().nextInt(5);
	int b = new Random().nextInt(5);
	World a = new World();
	
	a.show();
	/*
	Bug red = new  Bug();
	Location k = new Location(2,2);
	a.add(k, red);
	
	Bug blue = new Bug();
	blue.setColor(Color.BLUE);
	Location random = new Location(c,b);
	a.add(random,blue);
	for (int i = 0; i < 2; i++) {
		
	blue.turn();
	}
	Flower d = new Flower();
	b+=1;
	
	Location x = new Location(c,b);
	a.add(x, d);
	b-=2;
	Location one = new Location(c,b);
	a.add(one, d);
	*/
	int t = -1;

	int w = 0;
	for (int i = 0; i < 10; i++) {
		Flower pink = new Flower();
	t+=1;
	if(i%2 == 1){
	pink.setColor(Color.WHITE);
	}
	else{
		pink.setColor(Color.RED);
	}
	for (int ii = 0; ii < 10; ii++) {
	Location two = new Location(w,t);
	w+=1;
	
	a.add(two, pink);
}	
	w-=10;
}
}


	

}
