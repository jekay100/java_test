/**
 * @file Name: AWTFlowLayoutTest.java
 * @description:Test the AWTFlowLayoutTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 20:51:00
 */
import java.awt.*;
public class AWTFlowLayoutTest
{
	public static void main(String[] args) throws Exception
	{
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER,60,80);

		//construct a container
		Frame MainFrame = new Frame("hello");
		//set the size of the frame(container) and locate it on the postion you want
		MainFrame.setBounds(100,200,300,400);
		
		
		//add the button with the default layout
		MainFrame.add(new Button("Yes"));

		//use the layout FlowLayout f1 for all the components
		MainFrame.setLayout(fl);
		
		MainFrame.setVisible(true);
	}
}