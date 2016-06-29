import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutnessTV implements ActionListener {
	JButton Duck = new JButton();
	JButton Frogs = new JButton();
	JButton Unicorn = new JButton();

	void createButtons() {
		JPanel p = new JPanel();
		JFrame f = new JFrame();

		f.add(p);
		f.setVisible(true);
		p.add(Duck);
		p.add(Frogs);
		p.add(Unicorn);
		Duck.setText("See Ducks.");
		Frogs.setText("See Frogs.");
		Unicorn.setText("See Unicorns.");
		f.setSize(200, 130);
		Duck.addActionListener(this);
		Frogs.addActionListener(this);
		Unicorn.addActionListener(this);
	}

	public static void main(String[] args) {
		CutnessTV TV = new CutnessTV();
		TV.createButtons();

	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Duck) {
			showDucks();
		} else if (e.getSource() == Frogs) {
			showFrog();
		} else if (e.getSource() == Unicorn) {
			showFluffyUnicorns();
		}
	}
}
