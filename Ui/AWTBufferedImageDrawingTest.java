/**
 * @file Name: AWTBufferedImageDrawingTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014/7/6 13:06:19
 */
	import java.awt.*;
	import java.awt.event.*;
	import java.util.*;
	import java.awt.image.*;
	public class AWTBufferedImageDrawingTest
	{
		private Frame mainFrame = new Frame();
		private String RECT_shape = "rect";
		private String OVAL_shape = "oval";
		private String shapeToDraw = "";
		private MyCanvas drawArea = new MyCanvas();
		BufferedImage Image = new BufferedImage(300,300,BufferedImage.TYPE_INT_RGB);
		private Graphics ps = Image.getGraphics();
		class MyCanvas extends Canvas
		{
			public void paint(Graphics g) 
			{
				g.drawImage(Image,0,0,null);
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
					Random rand = new Random();
					ps.drawRect(rand.nextInt(200),rand.nextInt(200),50,50); 	
					drawArea.repaint();	
				}	
			});

			ButtOval.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) 
				{
					Random rand = new Random();
					ps.drawOval(rand.nextInt(200),rand.nextInt(200),50,50); 	
					drawArea.repaint();	
				}	
			});
			mainFrame.setBounds(0,0,300,300);
			MyPanel.add(ButtRect);
			MyPanel.add(ButtOval);
			MyPanel.setBackground(new Color(255,0,0)); 
			drawArea.setPreferredSize(new Dimension(300,300));
			mainFrame.add(MyPanel);
			mainFrame.add(drawArea,BorderLayout.SOUTH);
			mainFrame.pack();
			mainFrame.setVisible(true);
		}
		public static void main(String[] args)
		{
			new AWTBufferedImageDrawingTest().init();	
		}
	}  

