/**
 * @file Name: SwingWindowActionAdapterTest.java
 * @description:Test the SwingWindowActionAdapterTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-2 16:51:00
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SwingWindowActionAdapterTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		final JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);

		//add windowlistener
		MainFrame.addWindowListener(new WindowAdapter()
		{
			//implements the window close raction only the funcs you want
			public void windowClosing(WindowEvent e) 			
			{
				try
				{
					System.out.println("hi");
					int result = JOptionPane.showConfirmDialog(MainFrame, "yes?"); 
					if(result==0)
					{	 
						System.exit(0);
					}
				}
				catch(Exception d)
				{
					System.out.println("error");
				}
			}
		});
		MainFrame.setVisible(true);
	}
}