import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandofTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
		JFrame x = new JFrame();
		x.setVisible(true);
		// 2. Add the panel to the frame
		x.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);
		x.setSize(900, 900);
		// 4. Instantiate a Turtle 
	
// 5. Add the turtle to the panel 
		//int b = 400;
		//int y = 400;
		
		for (int i = 0; i< 90000; i++) {
			Turtle a = new Turtle();
			int c = new Random().nextInt(900);
			int d = new Random().nextInt(900);
			//b-=2;
			//y-=2;
			a.setX(c);
			a.setY(d);
		panel.addTurtle(a);
		}
// 6. Put 50 Turtles on the beach
		
	}
}
