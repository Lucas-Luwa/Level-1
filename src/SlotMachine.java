import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	int r1 = new Random().nextInt(9);
	int r2 = new Random().nextInt(9);
	int r3 = new Random().nextInt(9);
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JButton b = new JButton();
	public void create(int y) {

		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel l = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		p.add(l);
		p.add(l2);
		p.add(l3);
		l.setText(r1 + "");
		l2.setText(r2 + "");
		l3.setText(r3 + "");
		f.setSize(300, 300);
		f.add(p);
		f.setVisible(true);
		
		b.setText("Play Again!");
		p.add(b);
		b.setVisible(true);
		b.addActionListener(this);
		
		l5.setText("Your starting amount is " + y + ".");
	
		p.add(l5);
		p.add(l4);
		f.pack();
	}

	public void Money(int y) {
		if (r1 == r2) {
			if (r1 == r3) {
				y = y + y;
			l4.setText("You have " + y + ".");
			} else {
				y = y / 2;
				l4.setText("You have " + y + ".");
			}
		} else if (r2 == r3) {
			if (r1 == r3) {
				y = y + y;
				l4.setText("You have " + y + ".");
			} else {
				y = y / 2;
				l4.setText("You have " + y + ".");
			}
		} else if (r1 == r3) {
			if (r1 == r2) {
				y = y + y;
				l4.setText("You have " + y + ".");
			} else {
				y = y / 2;
				l4.setText("You have " + y + ".");
			}
		}
		else{
			y = 0;
			l4.setText("You have " + y + ".");
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b)){
		
			
		}
	}
}
