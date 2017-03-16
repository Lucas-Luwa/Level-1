package Calculator;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	Model m;
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JButton b10 = new JButton();
	JButton b11 = new JButton();
	JButton b12 = new JButton();
	JButton b13 = new JButton();
	JButton b14 = new JButton();
	JButton b15 = new JButton();
	JButton b16 = new JButton();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();

	public View(Model m) {
		// TODO Auto-generated constructor stub
		this.m = m;
	}

	public void Create() {
		JFrame f = new JFrame();
		p.setLayout(new GridLayout(5, 4));
		p.add(l);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		f.setVisible(true);
		f.add(p);
		p.add(b);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		f.pack();
		b.setText("7");
		b2.setText("8");
		b3.setText("9");
		b4.setText("/");
		b5.setText("4");
		b6.setText("5");
		b7.setText("6");
		b8.setText("x");
		b9.setText("1");
		b10.setText("2");
		b11.setText("3");
		b12.setText("-");
		b13.setText("0");
		b14.setText("c");
		b15.setText("+");
		b16.setText("=");

	}

	public void update() {
		l.setText(m.getFirstNumber());
		l3.setText(m.getSecondNumber());
		l2.setText(m.getOperator());
		l4.setText(m.getAnswer()+"");
	}

	public void addListener(ActionListener Controller) {
		b.addActionListener(Controller);
		b2.addActionListener(Controller);
		b3.addActionListener(Controller);
		b4.addActionListener(Controller);
		b5.addActionListener(Controller);
		b6.addActionListener(Controller);
		b7.addActionListener(Controller);
		b8.addActionListener(Controller);
		b9.addActionListener(Controller);
		b10.addActionListener(Controller);
		b11.addActionListener(Controller);
		b12.addActionListener(Controller);
		b13.addActionListener(Controller);
		b14.addActionListener(Controller);
		b15.addActionListener(Controller);
		b16.addActionListener(Controller);
	}
}
