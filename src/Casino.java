import javax.swing.JOptionPane;

public class Casino {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("How much money do you want to bet?");
	int y = Integer.parseInt(x);
	SlotMachine s = new SlotMachine();
	s.Money(y);
	s.create(y);
	
}
}
