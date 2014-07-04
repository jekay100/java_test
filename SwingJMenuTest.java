/**
 * @file Name: SwingJMenuTest.java
 * @description:Test the SwingJMenuTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-3 18:35:00
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class SwingJMenuTest
{
	public static void save()
	{
		}
	public static void main(String[] args) throws Exception
	{
		//construct a container
		JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		BorderLayout bl = new BorderLayout(40,40);
	
		//construct the menubar
		JMenuBar jmb = new JMenuBar();
		
		//construct the menus for the menubar	
		JMenu jm1 = new JMenu("New",true);
		JMenu jm2 = new JMenu("Save",true);
		JMenu jm3 = new JMenu("Search",true);
		JMenu jm4 = new JMenu("Runs",true);
		JMenu jm5 = new JMenu("Language",true);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jmb.add(jm5);
		
		//construct the menuitems for the menu
		JMenuItem jmi1 = new JMenuItem("1");
		JMenuItem jmi2 = new JMenuItem("2");
		JMenu jmi3 = new JMenu("3");
		JMenuItem jmi4 = new JMenuItem("4");
		jmi1.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_DOWN_MASK)); 
		jmi2.setAccelerator(KeyStroke.getKeyStroke('S',InputEvent.CTRL_DOWN_MASK)); 
		jm1.add(jmi1); 
		jm1.add(jmi2);
		//add separator in the menu
		jm1.addSeparator(); 
		jm1.add(jmi3); 
		jmi3.add(jmi4); 
		
		final JTextArea jta = new JTextArea(60,80);
		//add ActionListener for the menuitem
		jmi1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("hi");
			}
		});
		   boolean isModified = false;
		jta.getDocument().addDocumentListener(new DocumentListener(){
			
			public void changedUpdate(DocumentEvent e) 
			{
			}
			public void insertUpdate(DocumentEvent e) 
			{
				System.out.println("insert");
			}
			public void removeUpdate(DocumentEvent e) 
			{
				System.out.println("remove");
			}
		});
		
		MainFrame.add(jta,BorderLayout.CENTER);
		//add the menubar onto the frame
		MainFrame.setJMenuBar(jmb);
		MainFrame.setVisible(true);
	}
}