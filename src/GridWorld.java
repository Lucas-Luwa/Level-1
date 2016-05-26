import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		
	World a = new World();
	a.show();
	Bug x = new  Bug();
	Flower b = new Flower();
	Location y = new Location(2,2);
	a.add( y, x);
	

	
	
}



}
