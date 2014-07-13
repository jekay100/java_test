/**
 * @file Name: AWTCardLayoutTest.java
 * @description:Test the AWTCardLayoutTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 20:51:00
 */
import java.awt.*;
public class AWTCardLayoutTest
{
	public static void main(String[] args) throws Exception
	{
		CardLayout cl = new CardLayout(4,4);

		//construct a container
		Frame MainFrame = new Frame("hello");
		//set the size of the frame(container) and locate it on the postion you want
		MainFrame.setBounds(100,200,300,400);

		Panel pl = new Panel();
		//use the layout FlowLayout f1 for all the components
		pl.setLayout(cl);
		
		//add the button with the default layout
		pl.add(new Button("East"));
		pl.add(new Button("West"));
		pl.add(new Button("North"));
		pl.add(new Button("South"));

		//cl.next(pl);
		MainFrame.add(pl,BorderLayout.NORTH);
		
		Panel pl2 = new Panel();
		pl2.add(new Button("First"));
		pl2.add(new Button("Previous"));
		pl2.add(new Button("Next"));
		pl2.add(new Button("Last"));
		
		MainFrame.add(pl2,BorderLayout.SOUTH);
		MainFrame.setVisible(true);
	}
}