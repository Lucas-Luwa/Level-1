import javax.swing.JOptionPane;

public class MethodMaker {
	void go() {
		// 2. Call the method created in step 1
		Name();
		// 4. Call the method you created in step 3 with an int parameter that
		// tells
		// how old you will be by the end of this year
		Age(1);
		// 6. Call the method created in step 5 with a String and an int
		// parameter
		Print("", 1);
		// 8. Call the method created in step 7 with 2 integers, multiply these
		// numbers and display the result.
		Multiply(0, 0);
	}

	// 1. Create a method that asks the user's name and says they ROCK!
	// Hint: void yourMethodName() {
	// }
	public void Name() {
		String y = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, y + " Rocks!");
	}

	// 3. Create a method that has an int parameter for how old you will be by
	// the end of this year,
	// and creates a pop-up that tells you what year you were born.
	// Hint: void yourMethodName(int age) {
	// }
	public void Age(int x) {
		String i = JOptionPane.showInputDialog(null, "How old are you?");
		x = Integer.parseInt(i);
		JOptionPane.showMessageDialog(null, "You were born in  " + (2017 - x));

	}

	// 5. Create a method with a String parameter and an int parameter
	// "numTimes" which
	// prints the String parameter "numTimes". // Copy what you did in steps 1 &
	// 3, but with different parameter types.
	public void Print(String numTimes, int numtimes) {
		numTimes = JOptionPane.showInputDialog(null, "Choose a word.");
		String c = JOptionPane.showInputDialog(null, "Choose a number.");
		numtimes = Integer.parseInt(c);
		for (int i = 0; i < numtimes; i++) {
			JOptionPane.showMessageDialog(null, numTimes);
		}

	}

	// 7. Create a method that multiplies 2 numbers that are passed in as
	// parameters
	// and displays the results in a pop-up.
	public void Multiply(int x, int y) {
		int a;
		String g = JOptionPane.showInputDialog(null, "Choose a number.");
		String h = JOptionPane.showInputDialog(null, "Choose a number.");
		x = Integer.parseInt(h);
		y = Integer.parseInt(g);
		a = x * y;
		JOptionPane.showMessageDialog(null, a);

	}

	public static void main(String[] args) {
		new MethodMaker().go();
	}
}
