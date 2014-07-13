/**
 * @file Name: SwingTest.java
 * @description:Test the SwingTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-2 16:51:00
 */
import java.awt.*;
import javax.swing.*;

public class SwingTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);

		//JCheckBox
		MainFrame.add(new JCheckBox("good!"),bl.NORTH);
		
		//JColorChooser
		JColorChooser.showDialog(MainFrame, "hi", Color.black); 
		
		//JList
		String[] str = new String[]{"1","2","3"};
		MainFrame.add(new JList<String>(str),bl.SOUTH);
		
		//JOptionPane
		System.out.println(JOptionPane.showInputDialog(null,"please input:"));
		MainFrame.setVisible(true);
	}
}