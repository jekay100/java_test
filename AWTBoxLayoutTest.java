/**
 * @file Name: AWTBoxLayoutTest.java
 * @description:Test the AWTBoxLayoutTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 20:51:00
 */
import java.awt.*;
import javax.swing.*;

public class AWTBoxLayoutTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		Frame MainFrame = new Frame("hello");
		//set the size of the frame(container) and locate it on the postion you want
		MainFrame.setBounds(100,200,300,400);
		
		//BoxLayout for MainFrame
		BoxLayout bl1 = new BoxLayout(MainFrame,BoxLayout.Y_AXIS);
		MainFrame.setLayout(bl1);
		MainFrame.add(new Button("1"));
		MainFrame.add(new Button("2"));
		MainFrame.add(new Button("3"));
		
		Panel pl = new Panel();
		//BoxLayout for pl
		BoxLayout bl2 = new BoxLayout(pl,BoxLayout.X_AXIS);
		pl.setLayout(bl2);
		Panel pl1 = new Panel();
		//BoxLayout for pl1
		BoxLayout bl3 = new BoxLayout(pl1,BoxLayout.Y_AXIS);
		pl1.setLayout(bl3);
		pl1.add(new Button("4"));
		pl1.add(new Button("5"));
		pl.add(pl1);
		pl.add(new Button("6"));
		
		MainFrame.add(pl);
		
		MainFrame.setVisible(true);
	}
}