import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WordFind implements ActionListener {
	public static void main(String[] args) {
		WordFind WF = new WordFind();
		WF.Create();
		WF.Words();
	}

	String result = "";
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton[] buttons = new JButton[5];
	JTextField TF = new JTextField(6);

	public void Create() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setVisible(true);
		f.add(p);
		p.add(TF);
		p.add(b);
		b.setText("SUBMIT");
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		f.setSize(200, 200);
		buttons[0] = b;
		buttons[1] = b2;
		buttons[2] = b3;
		buttons[3] = b4;
		buttons[4] = b5;
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	public void Words() {
		b2.setText("F");
		b5.setText("A");
		b4.setText("S");
		b3.setText("T");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b) {
			if (TF.getText().equals("FAST")) {
				JOptionPane.showMessageDialog(null, "You Won!");

			} else {
				JOptionPane.showMessageDialog(null, "Loser!");
				b2.show(true);
				b3.show(true);
				b4.show(true);
				b5.show(true);
				result = "";
			}

		}
		if (e.getSource() == b2) {
			result += b2.getText();
			TF.setText(result);
			b2.show(false);
		}
		if (e.getSource() == b3) {
			result += b3.getText();
			TF.setText(result);
			b3.show(false);
		}
		if (e.getSource() == b4) {
			result += b4.getText();
			TF.setText(result);
			b4.show(false);

		}
		if (e.getSource() == b5) {
			result += b5.getText();
			TF.setText(result);
			b5.show(false);

		} else {

		}

	}

}
