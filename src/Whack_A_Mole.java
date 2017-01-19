import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_A_Mole implements ActionListener {
	public static void main(String[] args) {
		Whack_A_Mole pest = new Whack_A_Mole();
		pest.drawButtons();
		
	}
	JButton[] intofArray = new JButton[25];
	Random x = new Random();

	JFrame f = new JFrame();
	int y = x.nextInt(25);

	public void drawButtons() {
		
		
		
	
		JPanel p = new JPanel();
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
		JButton b17 = new JButton();
		JButton b18 = new JButton();
		JButton b19 = new JButton();
		JButton b20 = new JButton();
		JButton b21 = new JButton();
		JButton b22 = new JButton();
		JButton b23 = new JButton();
		JButton b24 = new JButton();

		f.add(p);
		f.setVisible(true);
		f.setSize(250, 300);
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
		p.add(b17);
		p.add(b18);
		p.add(b19);
		p.add(b20);
		p.add(b21);
		p.add(b22);
		p.add(b23);
		p.add(b24);
		
		intofArray[0]=b;
		intofArray[1]=b2;
		intofArray[2]=b3;
		intofArray[3]=b4;
		intofArray[4]=b5;
		intofArray[5]=b6;
		intofArray[6]=b7;
		intofArray[7]=b8;
		intofArray[8]=b9;
		intofArray[9]=b10;
		intofArray[10]=b11;
		intofArray[12]=b12;
		intofArray[13]=b13;
		intofArray[14]=b14;
		intofArray[15]=b15;
		intofArray[16]=b16;
		intofArray[17]=b17;
		intofArray[18]=b18;
		intofArray[19]=b19;
		intofArray[20]=b20;
		intofArray[21]=b21;
		intofArray[22]=b22;
		intofArray[23]=b23;
		intofArray[24]=b24;
		x.nextInt(25);
		
		intofArray[y].setText("Mole");
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		
		
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date(2017,01,18);
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			
		
		if(e.getSource()==intofArray[y]){
		speak("Winner");
		f.dispose();
		drawButtons();
		}
		else if(e.getSource()!=intofArray[y]){
		speak("Loser");
		f.dispose();
		drawButtons();
		}
		
		
		
	}


}
