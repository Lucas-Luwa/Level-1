import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu implements ActionListener {
	JLabel l = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JButton b = new JButton();
	public Menu() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setVisible(true);
		f.add(p);
		p.add(l);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		l.setText("Menu = ");
		l.setVisible(true);
		f.setSize(400, 200);
		p.setVisible(true);
		JTextField TF = new JTextField(10);
		p.add(TF);
		b.setText("Submit Your Order!");
		p.add(b);
	}

	void setl(String food) {
		l.setText(food);
	}

	void setl2(String food) {
		l2.setText(food);
	}

	void setl3(String food) {
		l3.setText(food);
	}

	void setl4(String food) {
		l4.setText(food);
	}

	void setl5(String food) {
		l5.setText(food);
	}
	public void addListener(ActionListener Controller){
		b.addActionListener(Controller);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
