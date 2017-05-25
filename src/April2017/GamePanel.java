package April2017;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	int l = 500;
	boolean Rain = true;
	Timer t = new Timer(1000 / 60, this);
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font titleFont2 = new Font("Arial", Font.PLAIN, 20);
	Font titleFont3 = new Font("Arial", Font.PLAIN, 25);

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Projectile j;
	Rocketship r = new Rocketship(250, 700, 50, 50);
	Song s = new Song("LAZE.mp3");
	ObjectManager OM = new ObjectManager();

	void startGame() {
		t.start();

	}

	GamePanel() {
		OM.addObject(r);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
			OM.setScore(0);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			} else {
				currentState++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			r.up = true;
			r.Down();
		}
		if (e.getKeyCode() == KeyEvent.VK_H && Rain) {
			OM.addObject(new Projectile(r.x + 00, r.y, 10, 10));
			OM.addObject(new Projectile(r.x - 50, r.y, 10, 10));
			OM.addObject(new Projectile(r.x - 100, r.y, 10, 10));
			OM.addObject(new Projectile(r.x - 150, r.y, 10, 10));
			OM.addObject(new Projectile(r.x - 200, r.y, 10, 10));
			OM.addObject(new Projectile(r.x - 250, r.y, 10, 10));
			OM.addObject(new Projectile(r.x - 300, r.y, 10, 10));
			OM.addObject(new Projectile(r.x + 50, r.y, 10, 10));
			OM.addObject(new Projectile(r.x + 100, r.y, 10, 10));
			OM.addObject(new Projectile(r.x + 150, r.y, 10, 10));
			OM.addObject(new Projectile(r.x + 200, r.y, 10, 10));
			OM.addObject(new Projectile(r.x + 250, r.y, 10, 10));
			OM.addObject(new Projectile(r.x + 300, r.y, 10, 10));
			OM.addObject(new Projectile(r.x + 350, r.y, 10, 10));
			Rain = false;
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
			s.play();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			r.down = true;
			r.Up();

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			r.left = true;
			r.Right();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			r.left();
			r.right = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			OM.addObject(new Projectile(r.x + 20, r.y, 10, 10));
			s.play();
		}

		else {

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		r.left = false;
		r.right = false;
		r.up = false;
		r.down = false;
	}

	void updateMenuState() {

	}

	void updateGameState() {
		OM.update();
		OM.manageEnemies();
		OM.checkCollision();
		if (r.isAlive == false) {
			currentState = END_STATE;
			OM.reset();
			r = new Rocketship(250, 700, 50, 50);
			OM.addObject(r);

		} else {

		}
		OM.update();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("League Invaders", 50, 200);
		g.drawString("Press ENTER to start.", 10, 270);
		g.drawString("Press SPACE to shoot.", 5, 320);
		g.setFont(titleFont2);
		g.drawString("Press the 'H' key to save yourself from trouble!", 30, 400);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.GREEN);
		OM.draw(g);
		g.setFont(titleFont3);
		if (OM.win == false) {
			g.drawString("Congradulations! You Won!", 100, 400);
		}

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.setFont(titleFont);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.GREEN);
		g.drawString("Game Over", 130, 300);
		g.drawString("Your Score Is " + OM.getScore() + "!", 70, 400);
		Rain = true;

	}

	class Song {

		private int duration;
		private String songAddress;
		private AdvancedPlayer mp3Player;
		private InputStream songStream;

		/**
		 * Songs can be constructed from files on your computer or Internet
		 * addresses.
		 * 
		 * Examples: <code> 
		 * 		new Song("everywhere.mp3"); 	//from default package 
		 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
		 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
		 * </code>
		 */
		public Song(String songAddress) {
			this.songAddress = songAddress;
		}

		public void play() {
			loadFile();
			if (songStream != null) {
				loadPlayer();
				startSong();
			} else
				System.err.println("Unable to load file: " + songAddress);
		}

		public void setDuration(int seconds) {
			this.duration = seconds * 100;
		}

		public void stop() {
			if (mp3Player != null)
				mp3Player.close();
		}

		private void startSong() {
			Thread t = new Thread() {
				public void run() {
					try {
						if (duration > 0)
							mp3Player.play(duration);
						else
							mp3Player.play();
					} catch (Exception e) {
					}
				}
			};
			t.start();
		}

		private void loadPlayer() {
			try {
				this.mp3Player = new AdvancedPlayer(songStream);
			} catch (Exception e) {
			}
		}

		private void loadFile() {
			if (songAddress.contains("http"))
				this.songStream = loadStreamFromInternet();
			else
				this.songStream = loadStreamFromComputer();
		}

		private InputStream loadStreamFromInternet() {
			try {
				return new URL(songAddress).openStream();
			} catch (Exception e) {
				return null;
			}
		}

		private InputStream loadStreamFromComputer() {
			try {
				return new FileInputStream(songAddress);
			} catch (FileNotFoundException e) {

				return this.getClass().getResourceAsStream(songAddress);
			}
		}
	}

}
