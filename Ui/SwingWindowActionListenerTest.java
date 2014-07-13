/**
 * @file Name: SwingWindowActionListenerTest.java
 * @description:Test the SwingWindowActionListenerTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-2 16:51:00
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SwingWindowActionListenerTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		final JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);

		//add windowlistener
		MainFrame.addWindowListener(new WindowListener()
		{
			//implements the window funcs all	
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
			public void windowActivated(WindowEvent e) 
			{}
			public void windowClosed(WindowEvent e) 
			{}
			
			public void windowDeactivated(WindowEvent e) 
			{}
			public void windowDeiconified(WindowEvent e) 
			{}
			public void windowIconified(WindowEvent e) 
			{}
			public void windowOpened(WindowEvent e) 
			{}
		
		});
		MainFrame.setVisible(true);
	}
}