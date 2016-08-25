import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Quiz_1 implements ActionListener {
	JButton B = new JButton();
	JButton B2 = new JButton();
public static void main(String[] args) {
 Quiz_1 n = new Quiz_1();
 n.set();

}
void set(){
	JFrame F = new JFrame();
	
	JPanel P = new JPanel();
	F.setVisible(true);
	F.setSize(200, 200);
	JLabel L = new JLabel();
	F.add(P);
	P.add(L);
	
	
	
	JTextField TF = new JTextField(2);
	TF.setVisible(true);
	P.add(TF);
	
	B.setSize(20, 20);
	B2.setSize(20,20);
	P.add(B);
	P.add(B2);
	
	
	
	
	L.setText("What goes up but doesn't come down?");
	B.setText("Submit"); 
	B.addActionListener(this);
	B2.setText("Hint");
	B2.addActionListener(this);
	
	F.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == B2){
		JOptionPane.showMessageDialog(null, "It is a two digit number");
		
	}
	if(e.getSource() == B){
		if()
		
	}
}
}
