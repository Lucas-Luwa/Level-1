import javax.swing.JOptionPane;

public class Model {
	String menuItem1 = "-Burger";

	String menuItem3 = "-Hot Dog";
	String menuItem4 = "-Fries";
	String menuItem5 = "-Ice Cream";

	String getmenuItem1() {
		return menuItem1;
	}

	String getmenuItem3() {
		return menuItem3;
	}

	String getmenuItem4() {
		return menuItem4;
	}

	String getmenuItem5() {
		return menuItem5;
	}

	void OnMenu(String Order) {
		if (Order.equals(menuItem1)) {
			JOptionPane.showMessageDialog(null, "Your Burger is Ready!");
		} else if (Order.equals(menuItem3)) {
			JOptionPane.showMessageDialog(null, "Your Hot Dog is Ready!");
		} else if (Order.equals(menuItem4)) {
			JOptionPane.showMessageDialog(null, "Your Fries is Ready!");
		} else if (Order.equals(menuItem5)) {
			JOptionPane.showMessageDialog(null, "Your Ice Cream is Ready!");
		} else {
			JOptionPane.showMessageDialog(null, "We don't have that here. Get out of my restaurant or I'll sue you!");
		}

	}
}
