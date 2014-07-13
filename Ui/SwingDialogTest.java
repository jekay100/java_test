/**
 * @file Name: SwingDialogTest.java
 * @description:Test the SwingDialogTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-2 20:51:00
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SwingDialogTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);

		JButton jbu1 = new JButton("yes");
		JButton jbu2 = new JButton("no");
		JButton jbu3 = new JButton("cancel");
		MainFrame.setLayout(new FlowLayout());
		MainFrame.add(jbu1);
		MainFrame.add(jbu2);
		MainFrame.add(jbu3);
		
		final JDialog jd1 = new JDialog(MainFrame,"yes",true);
		final JDialog jd2 = new JDialog(MainFrame,"no",false);
		final JDialog jd3 = new JDialog(MainFrame,"yes",true);
		
		//add button action react for button1
		jbu1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("yes");
				//show the dialog
				jd1.setVisible(true);
			}
		});
		
		//add button action react for button2
		jbu2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("no");
				//show the dialog
				jd2.setVisible(true);
			}
		});
		
		//add button action react for button3
		jbu3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("cancel");
				//show the dialog
				jd3.setVisible(true);
			}
		});
		
		MainFrame.setVisible(true);
	}
}