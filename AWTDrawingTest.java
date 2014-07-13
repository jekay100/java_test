/**
 * @file Name: AWTDrawingTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014/7/5 10:52:19
 */
	import java.awt.*;
	import java.awt.event.*;
	import java.util.*;
	public class AWTDrawingTest
	{
		private Frame mainFrame = new Frame();
		private String RECT_shape = "rect";
		private String OVAL_shape = "oval";
		private String shapeToDraw = "";
		private MyCanvas drawArea = new MyCanvas();
		class MyCanvas extends Canvas
		{
			public void paint(Graphics g) 
			{
				Random rand = new Random();
				if(shapeToDraw.equals(RECT_shape)==true)
				{
					g.drawRect(rand.nextInt(200),rand.nextInt(200),50,50); 	
				}

				if(shapeToDraw.equals(OVAL_shape)==true)
				{
					g.drawOval(rand.nextInt(200),rand.nextInt(200),50,40); 	
				}
			}
		}

		public void init()
		{
			Button ButtRect = new Button("rect");
			Button ButtOval = new Button("oval");
			Panel MyPanel = new Panel();
			ButtRect.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) 
				{
					shapeToDraw = RECT_shape;
					drawArea.repaint();	
				}	
			});

			ButtOval.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) 
				{
					shapeToDraw = OVAL_shape;
					drawArea.repaint();	
				}	
			});

			MyPanel.add(ButtRect);
			MyPanel.add(ButtOval);
			drawArea.setPreferredSize(new Dimension(300,300));
			mainFrame.add(MyPanel);
			mainFrame.add(drawArea,BorderLayout.SOUTH);
			mainFrame.pack();
			mainFrame.setVisible(true);
		}
		public static void main(String[] args)
		{
			//use the new object to use the non-static method and field in the static method
			new AWTDrawingTest().init();	
		}
	}  

