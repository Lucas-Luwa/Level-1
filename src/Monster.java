import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Monster implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JPanel p = new JPanel();
	JFrame f = new JFrame();

	public void create() {

		f.setVisible(true);
		f.setSize(400, 200);
		f.add(p);
		JLabel l = new JLabel();
		p.add(l);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		l.setText("Choose a Monster. After this, choose Trick or Treat!");
		b1.setText("Ghost");
		b2.setText("Zombie");
		b3.setText("Clown");
		b4.setText("Trick");
		b5.setText("Treat");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

	}

	public static void main(String[] args) {
		Monster m = new Monster("filename");
		m.create();

	}

	String filename;

	public Monster(String filename) {
		this.filename = filename;
	}

	public String getfilename() {
		return filename;
	}

	public void setfilename(String filename) {
		this.filename = filename;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			
				JLabel ImageL = new JLabel(new ImageIcon("Clown.jpg"));
				JOptionPane.showMessageDialog(null, "BOO!", "Scary", 1, new ImageIcon("Clown.jpg"));
				f.pack();
		
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {

		Icon icon = new ImageIcon(imageUrl);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

}
