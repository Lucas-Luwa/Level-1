import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	int click = 0;
	void Candy() {
		f.add(p);
		f.setVisible(true);
		f.setSize(100, 70);
		p.add(b);
		b.setText("Candyman");
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		Candyman c = new Candyman();
		c.Candy();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b){
			click+=1;
		}
		if(click == 5){
			showPictureFromTheInternet("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiq6bDCuM7NAhVERSYKHd3xDtgQjRwIBw&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DhYGOTmdKmV4&psig=AFQjCNHoGUeJdYfOiiyZjQB36OItaucaHw&ust=1467331117298847");
			
		}
			
	}

}
