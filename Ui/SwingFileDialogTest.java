/**
 * @file Name: SwingFileDialogTest.java
 * @description:Test the SwingFileDialogTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-3 10:42:00
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;
public class SwingFileDialogTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a container
		final JFrame MainFrame = new JFrame("hello");
		MainFrame.setBounds(100,200,300,400);
		//MainFrame.setLayout(new FlowLayout(10,10,10));
		BorderLayout bl = new BorderLayout(40,40);

		JButton jbu3 = new JButton("Choose");
	
		MainFrame.add(jbu3,BorderLayout.SOUTH);
		
		//add button action react for button3
		jbu3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 			{
				try
				{
					SwingDialogTest.readFile(MainFrame);
				}
				catch(Exception m)
				{
					System.out.println("Error");
				}
			}
		});
		MainFrame.setVisible(true);
	}
	
	static void readFile(Component c) throws Exception
	{
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(c);
		File f = jfc.getSelectedFile();
		
	 	if(f!=null)
		{ 
			//read the file with notepad
			Runtime rt = Runtime.getRuntime();
			rt.exec("notepad "+f.getPath());
		
		 	//read the line in the CMD line
			InputStreamReader isr = new InputStreamReader(new FileInputStream(f)); 
			BufferedReader br = new BufferedReader(isr);
			String tempstr = null;
			while((tempstr=br.readLine())!=null)
			{
				System.out.println(tempstr);
			}  
		
			//read the line in the textarea
			JTextArea jtp = new JTextArea();
			JFrame jf = (JFrame)c;
			jf.add(new JScrollPane(jtp));
	
			InputStreamReader isr1 = new InputStreamReader(new FileInputStream(f)); 
			BufferedReader br1 = new BufferedReader(isr1);
			String tempstr1 = null;
			while((tempstr1=br1.readLine())!=null)
			{
				jtp.append(tempstr1+"\n"); 
			}  
		}
	}
}