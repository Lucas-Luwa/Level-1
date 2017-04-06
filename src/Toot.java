

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Toot implements ActionListener {
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
public static void main(String[] args) {
	Toot t = new Toot();
	t.Create();
}
public void Create(){
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.setVisible(true);
	f.setSize(300, 100);
	f.add(p);
	
	
	p.add(b);
	p.add(b2);
	p.add(b3);
	b.setText("Cheese");
	b2.setText("Loud");
	b3.setText("Fart");
	b.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == b){
		playSound("String Cheese Fart-SoundBible.com-676437823.wav");
	}
	else if(e.getSource() == b2){
		playSound("Iguana_Farts_In_A_Bathtub-Iguana_Farts-1423164123.wav");
	}
	else if(e.getSource() == b3){
		playSound("Fart-SoundBible.com-1477907970.wav");
	}
	else{
		
	}
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

}
