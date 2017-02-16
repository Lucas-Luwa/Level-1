import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Matching implements ActionListener {
	public static void main(String[] args) {
		Matching m = new Matching();
		m.Create();
	}

	JLabel l6 = new JLabel();
	JLabel l7 = new JLabel();
	JLabel l8 = new JLabel();
	JLabel l9 = new JLabel();
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	int Counter;
	JLabel l = new JLabel();

	public void Create() {
		JFrame f = new JFrame();
		f.setVisible(true);
		JPanel p = new JPanel();
		f.add(p);
		f.setSize(200, 200);
		p.setVisible(true);

		l.setText("Counter " + Counter);
		ImageIcon i = new ImageIcon("cat2.jpg");
		ImageIcon i2 = new ImageIcon("dog.jpg");
		JLabel l2 = new JLabel(i);
		JLabel l3 = new JLabel(i2);
		JLabel l4 = new JLabel(i2);
		JLabel l5 = new JLabel(i);
		p.add(l6);
		p.add(l7);
		p.add(l8);
		p.add(l9);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l);
		p.add(b);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b.add(l6);
		b.add(l7);
		b.add(l8);
		b.add(l9);
		l6.setText("X");
		l7.setText("Y");
		l8.setText("Y");
		l9.setText("X");
		l6.hide();
		l7.hide();
		l8.hide();
		l9.hide();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(b)) {
			Counter += 1;
			l.setText("Counter " + Counter);
		}
		if (e.getSource().equals(b2)) {
			Counter += 1;
			l.setText("Counter " + Counter);
		}
		if (e.getSource().equals(b3)) {
			Counter += 1;
			l.setText("Counter " + Counter);
		}
		if (e.getSource().equals(b4)) {
			Counter += 1;
			l.setText("Counter " + Counter);
		}
		/*
		 * String buttonText1; String buttonText2; if (e.getSource() instanceof
		 * JButton) { buttonText1 = ((JButton) e.getSource()).getText();
		 * ((Component) e.getSource()).show(true); if (e.getSource() instanceof
		 * JButton) { buttonText2 = ((JButton) e.getSource()).getText(); if
		 * (buttonText1 == buttonText2) { ((Component)
		 * e.getSource()).show(true); } if (buttonText1 != buttonText2) {
		 * l6.hide(); l7.hide(); l8.hide(); l9.hide(); }
		 */

	}
}
