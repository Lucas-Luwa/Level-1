import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	Menu m;
	Model md;

	Controller(Menu m, Model md) {
		this.m = m;
		this.md = md;
		setup();
		m.addListener(this);
	}
	void setup(){
		String menuItem1 = md.getmenuItem1();
		m.setl2(menuItem1);
		String menuItem3 = md.getmenuItem3();
		m.setl3(menuItem3);
		String menuItem4 = md.getmenuItem4();
		m.setl4(menuItem4);
		String menuItem5 = md.getmenuItem5();
		m.setl5(menuItem5);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(m.equals("steak")){
			System.out.println("troll");
		}
			
		
				
	}
}
