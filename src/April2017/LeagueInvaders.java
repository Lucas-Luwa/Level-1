package April2017;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame f;
	GamePanel GP = new GamePanel();

	public static void main(String[] args) {
		LeagueInvaders l = new LeagueInvaders();

	}

	public LeagueInvaders() {
		f = new JFrame();
		create();
	}

	public void create() {
		f.setSize(500, 800);
		f.setVisible(true);
		f.add(GP);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GP.startGame();
		f.addKeyListener(GP);
	}
}
