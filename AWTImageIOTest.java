/**
 * @file Name: AWTImageIOTest.java
 * @description:Test the AWTImageIOTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-6 16:24:00
 */
import java.awt.*;
import javax.swing.*;
import java.util.concurrent.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;

public class AWTImageIOTest
{
	public static void main(String[] args) throws Exception
	{
		ThreadLocalRandom rand = ThreadLocalRandom.current();
		BufferedImage image = new BufferedImage(200,150,BufferedImage.TYPE_4BYTE_ABGR );
		Graphics ps = image.getGraphics();
		//use Graphics2D to ratota the image
		Graphics2D pd = (Graphics2D)ps;
		pd.setColor(new Color(255,0,0)); 
		pd.setBackground(new Color(255,0,0));
		int x=40;
		for(int i=1;i<=6;i++) 
		{
		 	//get the char by random
			char ch = (char)rand.nextInt(65,65+26); 
			double ang = rand.nextDouble(Math.PI/12,Math.PI/6);
			//rotate the pd
			pd.rotate(ang,x,80); 
			//draw the char on the image
			pd.drawString(""+ch, x, 60); 
			//recover the pd
			pd.rotate(-ang,x,80); 
			x=x+20;
		}
		
		pd.setColor(new Color(0,0,0)); 
		for(int j=0;j<100;j++)
		{
			int xStart = rand.nextInt(20,180);
			int yStart = rand.nextInt(10,130);
			int xEnd = rand.nextInt(60,180);
			int yEnd = rand.nextInt(30,140);
			pd.drawLine(xStart,yStart,xEnd,yEnd);
		}
		ImageIO.write(image,"png",new File(UUID.randomUUID()+"1.png"));
	}
}