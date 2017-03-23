import javax.swing.JOptionPane;

public class Friends {

	public static void main(String[] args) {
		// 3. Create an instance of Classmate for each person in your class.
		Classmate Harris = new Classmate();
		Classmate Chloe = new Classmate();
		Classmate Vish = new Classmate();
		Classmate David = new Classmate();
		// 4. set descriptions for each Classmate
		Harris.setDescription("Harris is a very nice and smart person that learns Java in our class.");
		Chloe.setDescription("Chloe is a troll that is also a sister...bad combination!!!");
		Vish.setDescription("Vish is a very smart and thoughtful person in our class learning Java.");
		David.setDescription("David is a classmate in Java class.");

		// 5. Use your getter to print out each description
		Harris.getdescription();
		JOptionPane.showMessageDialog(null, Harris.getdescription());
		Chloe.getdescription();
		JOptionPane.showMessageDialog(null, Chloe.getdescription());
		Vish.getdescription();
		JOptionPane.showMessageDialog(null, Vish.getdescription());
		David.getdescription();
		JOptionPane.showMessageDialog(null, David.getdescription());
	}

}

class Classmate {
	private String description;

	// 1. create a setter that sets a description for this person
	void setDescription(String description) {
		this.description = description;
	}

	// 2. create a getter that gets a description of this person
	String getdescription() {
		return description;
	}
}
