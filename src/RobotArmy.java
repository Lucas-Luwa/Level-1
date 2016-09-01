
public class RobotArmy {
	public static void main(String[] asd) {
		// 1. create a new human
		Human h = new Human("BOB");
		// 2. create a new Robot army of good and evil robots.
		Robot r = new Robot("AXE", true, 9);
		Robot r2 = new Robot("TOMBSTONE", true, 7);
		Robot r3 = new Robot("NICE", false, 1 );
		Robot r4 = new Robot("KIND", false, 2);
		
		// 3. command your robot army to destroy a human
		r.destroy(h);
		r2.destroy(h);
		r3.destroy(h);
		r4.destroy(h);
		r.botfight(r4);
		r2.botfight(r3);
		r.botfight(r2);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;

	public Human(String name) {
		this.name = name;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}

	public void die() {
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	int power;
	boolean Alive;

	public Robot(String name, boolean isEvil, int power) {
		this.name = name;
		this.isEvil = isEvil;
		this.Alive = true;
		this.power = power;
	}

	public void die() {
		Alive = false;
	}

	public void destroy(Human man) {
		if (isEvil) {
			System.out
					.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		} else {
			System.out.println("No!! The robot " + name + " likes " + man.getName() + "...too late " + man.getName()
					+ "'s head is gone!");
		}
	}
public int getPower() {
	return power;
}
public String getName(){
	return name;
}
	public void botfight(Robot r){
		if(power < r.getPower()){
			System.out.println("The robots are fighting each other and " +name + " has destroyed " + r.getName());
		}
		else if (power > r.getPower()){
			System.out.println("The robots have turned on each other and " +name + " has destroyed " + r.getName());
		}
		
	}
	
	


}


