import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.MissingFormatArgumentException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {

	void showButton(){
	
	JFrame f = new JFrame();	
	f.setVisible(true);
	f.setSize(700, 700);
	JButton b = new JButton();
	f.add(b);
	b.setText("Hit Me!!!");
	b.addActionListener(this);
	}
	public static void main(String[] args) {
	FortuneCookie showButton = new FortuneCookie();
	showButton.showButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "Yay, you smashed the button!");
		int x = new Random().nextInt(5);
		if (x ==0){
		JOptionPane.showMessageDialog(null, "You will be bored tomorrow.");
		}
		if (x ==1){
		JOptionPane.showMessageDialog(null, "You will get a A on you next test.");
		}
		if (x ==2){
		JOptionPane.showMessageDialog(null, "You will be bored next year by school.");
		}
		if (x ==3){
		JOptionPane.showMessageDialog(null, "You will get a C on you next quiz.");
		}
		if (x ==4){
		JOptionPane.showMessageDialog(null, "You will fall off your bed tomorrow.");
		}
	}
	}
