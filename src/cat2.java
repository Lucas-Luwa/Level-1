public class cat2 {

	private String name;
	private int lives = 9;

	cat2(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		cat2 Cat = new cat2("Scratchy");
		Cat.meow();

		// 2. Get the Cat to print it's name
		Cat.printName();
		// 3. Kill the Cat!
		for (int i = 0; i < 9; i++) {

			Cat.kill();
		}
	}
}
