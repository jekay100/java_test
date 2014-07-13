/**
 * @file Name: SwingToolBarTest.java
 * @description:Test the SwingToolBarTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-2 20:11:00
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingToolBarTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);

		JToolBar jtb = new JToolBar("good", JToolBar.HORIZONTAL);
		 Action ac1 = new AbstractAction("yes") 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("yes");
			}
		};
		 Action ac2 = new AbstractAction("no") 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("no");
			}
		};
		 Action ac3 = new AbstractAction("cancel") 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("cancel");
			}
		};
		jtb.add(ac1);  
		jtb.add(ac2);  
		jtb.addSeparator(); 
		jtb.add(ac3);  
		
	 	String[] str1 = new String[]{"Name","Age","Gender"};
		String[][] str2 = new String[][]{new String[]{"Jim","13","male"},new String[]{"Mary","15","female"},new String[]{"Jack","11","male"}};
		
		JTable jt = new JTable(str2,str1);
		JScrollPane jsp = new JScrollPane(jt); 
		MainFrame.add(jsp);
		MainFrame.add(jtb,BorderLayout.NORTH);
		MainFrame.setVisible(true);
	}
}