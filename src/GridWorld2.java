import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld2 {
	
public static void main(String[] args) {
	World W = new World();
	//SmilyFace(W);
	Checker(W);
	
}
static public void SmilyFace(World W){
	W.show();
	Bug b = new Bug();
	Location l = new Location(5,5);
	Location l2 = new Location(5,4);
	Location l3 = new Location(5,3);
	Location l4 = new Location(4,2);
	Location l5 = new Location(4,6);
	W.add(l, b);
	W.add(l2, b);
	W.add(l3, b);
	W.add(l4, b);
	W.add(l5, b);
	Flower f = new Flower();
	Flower f2 = new Flower();
	f2.setColor(Color.green);
	Location lf = new Location(3,4);
	W.add(lf, f);
	Location lf2 = new Location(2,3);
	Location lf3 = new Location(2,5);
	W.add(lf2, f2);
	W.add(lf3, f2);
}
static public void Checker(World W){
	int x = 0;
	int y = 0;
	int x2 = 1;
	int y2 = 1;
	int x3 = 0;
	int y3 = 2;
	int x4 = 1;
	int y4 = 3;
	int x5 = 0;
	int y5 = 4;
	int x6 = 1;
	int y6 = 5;
	int x7 = 0;
	int y7 = 6;
	int x8 = 1;
	int y8 = 7;
	int x9 = 0;
	int y9 = 8;
	int x10 = 1;
	int y10 = 9;
	W.show();
	Bug b = new Bug();

	for (int i = 0; i < 5; i++) {
		Location lb = new Location(x,y);
		x+=2;

		W.add(lb, b);
	}

	for (int i = 0; i < 5; i++) {
		Location lb2 = new Location(x2,y2);
		x2+=2;

		W.add(lb2, b);
	}
	for (int i = 0; i < 5; i++) {
		Location lb3 = new Location(x3,y3);
		x3+=2;

		W.add(lb3, b);
	}
	for (int i = 0; i < 5; i++) {
		Location lb4 = new Location(x4,y4);
		x4+=2;

		W.add(lb4, b);
	}for (int i = 0; i < 5; i++) {
		Location lb5 = new Location(x5,y5);
		x5+=2;

		W.add(lb5, b);
	}
	for (int i = 0; i < 5; i++) {
		Location lb6 = new Location(x6,y6);
		x6+=2;

		W.add(lb6, b);
	}for (int i = 0; i < 5; i++) {
		Location lb7 = new Location(x7,y7);
		x7+=2;

		W.add(lb7, b);
	}for (int i = 0; i < 5; i++) {
		Location lb8 = new Location(x8,y8);
		x8+=2;

		W.add(lb8, b);
	}for (int i = 0; i < 5; i++) {
		Location lb9 = new Location(x9,y9);
		x9+=2;

		W.add(lb9, b);
	}for (int i = 0; i < 5; i++) {
		Location lb10 = new Location(x10,y10);
		x10+=2;

		W.add(lb10, b);
	}
	Flower f = new Flower();
	
	for (int yf = 0; y < 10; y+=2) {
		
	
	for (int xf = 1; x < 7; x+=2) {
		Location L = new Location(xf,yf);

		W.add(L, f);
	}
	}
}
}




