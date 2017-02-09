import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Skillz implements ActionListener {
	public static void main(String[] args) {
		Skillz s = new Skillz();
		s.create();
	}

	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	int x = 10;
	JLabel l = new JLabel();

	public void create() {

		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setVisible(true);
		f.add(p);
		f.setSize(250, 90);
		p.add(b);
		p.add(b2);
		p.add(b3);
		b.setText("ADD");
		b2.setText("SUB");
		b3.setText("RAND");
		l.setText("" + x);
		p.add(l);

		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(b)) {
			x += 1;
			l.setText("" + x);
		}
		if (e.getSource().equals(b2)) {
			x -= 1;
			l.setText("" + x);
		}
		if (e.getSource().equals(b3)) {
			x = new Random().nextInt(100);

			l.setText("" + x);

		}

	}
}
