
/**
 * @file Name: AWTBorderLayoutTest.java
 * @description:Test the AWTBorderLayoutTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 20:51:00
 */
import java.awt.*;
public class AWTBorderLayoutTest
{
	public static void main(String[] args) throws Exception
	{
		BorderLayout bl = new BorderLayout(10,10);
		
		//construct a container
		Frame MainFrame = new Frame("hello");
		//set the size of the frame(container) and locate it on the postion you want
		MainFrame.setBounds(100,200,300,400);
		
		
		//add new buttons with the layout b1
		MainFrame.add(new Button("East"),bl.EAST);
		MainFrame.add(new Button("West"),bl.WEST);
		MainFrame.add(new Button("North"),bl.NORTH);
		MainFrame.add(new Button("South"),bl.SOUTH); 
		
		//create a panel with layout bl to contain two buttons
		Panel pl = new Panel(bl);
		pl.add(new Button("East"),bl.EAST);
		pl.add(new Button("West"),bl.WEST);

		//add the panel with layout bl
		MainFrame.add(pl,bl.CENTER);
		
		MainFrame.setVisible(true);
	}
}	