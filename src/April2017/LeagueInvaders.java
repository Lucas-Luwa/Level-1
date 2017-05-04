package April2017;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame f;
	GamePanel GP = new GamePanel();
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	public static void main(String[] args) {
		LeagueInvaders l = new LeagueInvaders();

	}

	public LeagueInvaders() {
		f = new JFrame();
		create();
	}

	public void create() {
		f.setSize(WIDTH, HEIGHT);
		f.setVisible(true);
		f.add(GP);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GP.startGame();
		f.addKeyListener(GP);
	}
}
