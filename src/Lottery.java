import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		
	for (int i = 0; i < 100; i++) {
		
	
int a = new Random().nextInt(9);
int b = new Random().nextInt(9);
int c = new Random().nextInt(9);
int d = new Random().nextInt(9);
JOptionPane.showMessageDialog(null, a*1000 + b*100 + c*10 + d);
	}
}
}