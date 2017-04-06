

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Competition implements ActionListener {
	String Lucas = "Lucas";
	String Chloe = "Chloe";
	String Olivia = "Olivia";
	String Tina = "Tina";
	String Vish = "Vish";
	Boolean FirstPanel = false;
	JButton b = new JButton();
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	int x = new Random().nextInt(2);
	JLabel l = new JLabel();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	int x2 = new Random().nextInt(2);
	JLabel l3 = new JLabel();
	JLabel l2 = new JLabel();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	int x3 = new Random().nextInt(2);
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	int x4 = new Random().nextInt(2);
	JButton b10 = new JButton();
	JButton b11 = new JButton();
	int x5 = new Random().nextInt(2);

	public static void main(String[] args) {
		Competition c = new Competition();

		c.Create();
		c.Check();

	}

	public void Check() {
		if (FirstPanel == true) {
			Begin();
		}
	}

	public void Create() {

		f.setVisible(true);
		f.setSize(600, 600);
		f.add(p);
		b.setText("Enter IF You Dare!!!");
		p.add(b);
		b.addActionListener(this);
	}

	public void Begin() {

		p.remove(b);

		p.add(l);
		p.add(l2);
		l2.setText("                                                                                 ");
		l.setText("The First Competition is Lucas vs Chloe! Activity = Bobbing for a fish! Predict it!");
		p.add(b2);
		b2.setText(Lucas);
		p.add(b3);
		b3.setText(Chloe);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public void Two() {

		p.remove(b2);
		p.remove(b3);
		l2.setText("                                                                                 ");
		l.setText("The Second Competition is Lucas vs Olivia! Activity = Hot Dog eating contest! Predict it!");
		p.add(b4);
		b4.setText(Lucas);
		p.add(b5);
		b5.setText(Olivia);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	public void Three() {

		p.remove(b4);
		p.remove(b5);
		l.setText("The Third Competition is Lucas vs Tina! Activity = Smashing 10 spiders! Predict it!");
		p.add(b6);
		b6.setText(Lucas);
		p.add(b7);
		b7.setText(Tina);
		b6.addActionListener(this);
		b7.addActionListener(this);
	}

	public void Four() {

		p.remove(b6);
		p.remove(b7);
		l.setText("The Fourth Competition is Lucas vs Vish! Activity = Bending a titanium bar! Predict it!");
		p.add(b8);
		b8.setText(Lucas);
		p.add(b9);
		b9.setText(Vish);
		b8.addActionListener(this);
		b9.addActionListener(this);
	}

	public void Five() {

		p.remove(b8);
		p.remove(b9);
		l.setText("The Fifth Competition is Chloe vs Olivia! Activity = Folding a paper airplane! Predict it!");
		p.add(b10);
		b10.setText(Chloe);
		p.add(b11);
		b11.setText(Olivia);
		b10.addActionListener(this);
		b11.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b) {

			Begin();

		}
		if (e.getSource() == b2 || e.getSource() == b3) {
			if (x == 0) {
				JOptionPane.showMessageDialog(null, "Lucas wins!");
				Two();
			} else if (x == 1) {
				JOptionPane.showMessageDialog(null, "Chloe wins!");
				Two();
			} else {

			}
		}
		if (e.getSource() == b4 || e.getSource() == b5) {
			if (x2 == 0) {
				JOptionPane.showMessageDialog(null, "Lucas wins!");
				Three();
			} else if (x2 == 1) {
				JOptionPane.showMessageDialog(null, "Olivia wins!");
				Three();
			} else {

			}
		}
		if (e.getSource() == b6 || e.getSource() == b7) {
			if (x3 == 0) {
				JOptionPane.showMessageDialog(null, "Lucas wins!");
				Four();
			} else if (x3 == 1) {
				JOptionPane.showMessageDialog(null, "Tina wins!");
				Four();
			} else {

			}
		}
		if (e.getSource() == b8 || e.getSource() == b9) {
			if (x4 == 0) {
				JOptionPane.showMessageDialog(null, "Lucas wins!");
				Five();
			} else if (x4 == 1) {
				JOptionPane.showMessageDialog(null, "Vish wins!");
				Five();
			} else {

			}
			if (e.getSource() == b10 || e.getSource() == b11) {
				if (x5 == 0) {
					JOptionPane.showMessageDialog(null, "Chloe wins!");
					Five();
				} else if (x5 == 1) {
					JOptionPane.showMessageDialog(null, "Olivia wins!");
					Five();
				} else {

				}
			}
		}

	}
}
