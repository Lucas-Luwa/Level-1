

public class Rocket {
	int fuel = 10;
	int tfuel = fuel;
	int altitude = 1000;
	String name;

	Rocket(int fuel, String name) {
		System.out.println("Constructing Rocket");
		this.fuel = fuel;
		this.tfuel = fuel;

		this.name = name;
	}

	public void launch() {
		for (int i = 0; i < fuel; i++) {
			tfuel -= 1;
			altitude *= 1.65466523;
			System.out.println(tfuel);
			System.out.println("You are at " + altitude + " feet!");
			if (tfuel == 0) {
				System.out.println("You are out of fuel!");

			} else {

			}
		}

	}
}
