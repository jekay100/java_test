/**
 * @file Name: AWTGridLayoutTest.java
 * @description:Test the AWTGridLayout class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 20:51:00
 */
import java.awt.*;
public class AWTGridLayoutTest
{
	public static void main(String[] args) throws Exception
	{
		GridLayout gl = new GridLayout(2,2,5,5);
		
		//construct a container
		Frame MainFrame = new Frame("hello");
		//set the size of the frame(container) and locate it on the postion you want
		MainFrame.setBounds(100,200,300,400);

		//set the layout gl
		MainFrame.setLayout(gl);

		//add buttons
		MainFrame.add(new Button("East"));
		MainFrame.add(new Button("West"));
		MainFrame.add(new Button("North"));
		MainFrame.add(new Button("South"));
		MainFrame.pack();
		MainFrame.setVisible(true);
	}
}