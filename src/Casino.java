import javax.swing.JOptionPane;

public class Casino {
	public static void main(String[] args) {
		SlotMachine s = new SlotMachine();
		String x = JOptionPane.showInputDialog("How much money do you want to bet?");
		int y = Integer.parseInt(x);
		s.create(y);
		s.Money(y);
	}
}
