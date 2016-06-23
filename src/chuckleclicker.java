import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener{
	JButton j = new JButton();
	JButton punch = new JButton();
	JButton j2 = new JButton();
	JButton punch2 = new JButton();
	void makebuttons(){
		JFrame f = new JFrame();
		f.setVisible(true);
		JPanel p = new JPanel();
		f.add(p);
		
		p.add(j);
		p.add(punch);
		p.add(j2);
		p.add(punch2);
		f.setSize(230, 100);
		j.addActionListener(this);
		punch.addActionListener(this);
		j.setText("Joke");
		punch.setText("Punchline");
		j2.addActionListener(this);
		punch2.addActionListener(this);
		j2.setText("Joke2");
		punch2.setText("Punchline2");
	}
public static void main(String[] args) {
	chuckleclicker makebuttons = new chuckleclicker();
	makebuttons.makebuttons();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//JOptionPane.showMessageDialog(null, "Hi");
	if(e.getSource()==j){
		JOptionPane.showMessageDialog(null, "Why was 6 afraid of 7?");
	}
	else if (e.getSource() == punch){
		JOptionPane.showMessageDialog(null, "Because 7 ate(8) 9!!!:)");
	}
	else if (e.getSource() == j2){
		JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
	}
	else if (e.getSource()== punch2){
		JOptionPane.showMessageDialog(null, "To get to the other side.");
	}
}
}
