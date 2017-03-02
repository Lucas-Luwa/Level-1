package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		System.out.println("cat");
	}
}
