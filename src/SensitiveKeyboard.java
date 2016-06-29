import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SensitiveKeyboard implements KeyListener {
	void createFrame() {
		JFrame f = new JFrame();
		f.addKeyListener(this);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		SensitiveKeyboard k = new SensitiveKeyboard();
		k.createFrame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("owieee");
		JOptionPane.showMessageDialog(null, "OUCH");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
