import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class BOI2 implements MouseListener {
public static void main(String[] args) throws Exception{
	BOI2 i = new BOI2();
	i.CreateB();
}
JFrame x = new JFrame();
void CreateB(){
	x.setVisible(true);
	x.setSize(200,200);
	String c = "BIRD.png";
	
	
	JLabel l = loadImageFromComputer(c);
	
	x.add(l);
	x.pack();
	x.addMouseListener(this);
	
}

public JLabel loadImageFromComputer(String fileName){
	URL imageURl = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURl);
	return new JLabel(icon);
}
public void Mousehit(MouseEvent e){
	
	
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Clicked!!");
	x.removeAll();
	
	}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub

	x.setVisible(true);
	x.setSize(200,200);
	String d = "Dog.jpeg";
	JLabel L = loadImageFromComputer(d);
	x.add(L);
	x.pack();
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	

}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


}