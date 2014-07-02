/**
 * @file Name: SwingTableTest.java
 * @description:Test the SwingTableTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-2 16:51:00
 */
import java.awt.*;
import javax.swing.*;
public class SwingTableTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);

		String[] str1 = new String[]{"Name","Age","Gender"};
		String[][] str2 = new String[][]{new String[]{"Jim","13","male"},new String[]{"Mary","15","female"},new String[]{"Jack","11","male"}};
		
		JTable jt = new JTable(str2,str1);
		JScrollPane jsp = new JScrollPane(jt);
		MainFrame.add(jsp);
		MainFrame.setVisible(true);
	}
}