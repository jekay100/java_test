/**
 * @file Name: SwingActionlistenerTest.java
 * @description:Test the SwingActionlistenerTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-3 13:30:00
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SwingActionlistenerTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);
		
		//create your own actionlistener for click and implements the reaction func. In this case you can add the actionlistener for different components. In other cases, you can use anonymous class to construct a single Object for the component.
		class MyEventListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(e.getActionCommand());				
				System.out.println(e.getWhen());
			}
		}
				
		JButton bu1 = new JButton("Yes");
		JButton bu2 = new JButton("No");
		//add the actionlistener for your buttons
		//one actionlistener can be used for different components. one component can use several actionlisteners
		bu1.addActionListener(new MyEventListener());
		bu2.addActionListener(new MyEventListener());
		
		MainFrame.add(bu1,BorderLayout.NORTH);
		MainFrame.add(bu2,BorderLayout.SOUTH);
		MainFrame.setVisible(true);
	}
}