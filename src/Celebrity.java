import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Celebrity {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/Armstrong.jpg";
	String secondImage = "/Users/league/Desktop/beiber.jpg";
	String thirdImage = "/Users/league/Desktop/sanders.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(100, 100);
		// Make an int variable to hold the score.
		int score = 0;
		String Answer;
		// Ask the user who this person is and store their answer
		Answer = JOptionPane.showInputDialog("Who is this person?(Last Name Only!)");
		// If they got the answer right:
		if(Answer.equalsIgnoreCase("armstrong")){
			score += 1;
			
		}
		else{
			System.out.println("You are wrong!!!!!");
			
	
		}
		showNextImage();
		window.setSize(200, 200);
		Answer = JOptionPane.showInputDialog("Who is this person?(Last Name Only!)");
		// If they got the answer right:
		if(Answer.equalsIgnoreCase("beiber")){
			score += 1;
			
		}
		else{
			System.out.println("You are wrong!!!!!");
			
	
		}
		showNextImage();
		window.setSize(400, 400);
		Answer = JOptionPane.showInputDialog("Who is this person?(Last Name Only!");
		// If they got the answer right:
		if(Answer.equalsIgnoreCase("sanders")){
			score += 1;
			
		}
		else{
			System.out.println("You are wrong!!!!!");
			
	
		}
		System.out.println(score+"/3");
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		Celebrity quiz = new Celebrity();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


