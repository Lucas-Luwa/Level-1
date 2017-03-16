package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Controller implements ActionListener {
	Model m;
	View v;
	

	Controller(View v, Model m) {
		this.v = v;
		this.m = m;
		v.addListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) (e.getSource());
		String text = b.getText();
		System.out.println(text);
		m.ADDADIGIT(text);
		v.update();
		
		if (e.getSource().equals(text)) {
		
		}
	}
}
