/**
 * @file Name: AWTPinBallTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014/7/5 14:17:39
 */
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class AWTPinBallTest
{
	JFrame f = new JFrame("PingPong Ball. Version 1.0 By trilever");
	MyCanvas tableArea = new MyCanvas();
	
	//the size of the table
	int tableX=1100;
	int tableY=650;

	//the default Xpos of racket_left_point
	int racketX=0;
	//the default Ypos of racket_top_point
	int racketY=645;
	int racketWidth=100;
	int racketHeight=tableY-racketY;

	//the default speed of the ball
	int speedY=5;
	Random rand = new Random();
	int speedX=rand.nextInt(5);

	//the default pos of the ball
	int ballX=40;
	int ballY=40;
	int ballRad=20;
	
	javax.swing.Timer timer;
	boolean gameIsOver=false;
	class MyCanvas extends JPanel
	{
		public void paint(Graphics g)
		{
			if(gameIsOver==true)
			{
				g.setColor(new Color(255,0,0));
				g.setFont(new Font("Times",Font.BOLD,30));
				g.drawString("Game is over!",450,325);
			}
			else
			{
				g.setColor(new Color(255,0,0));
				//draw the rect
				g.fillRect(racketX, racketY, racketWidth, racketHeight); 
				g.setColor(new Color(128,118,105));
				//draw the oval
				g.fillOval(ballX, ballY, ballRad, ballRad); 
			}
		}
	}
	public void init()
	{
		//set the size of the table
		f.setLocation(110,10);
		f.setBackground(new Color(25,25,112));
		tableArea.setPreferredSize(new Dimension(tableX, tableY) );
		f.add(tableArea);	
		KeyAdapter ka = new KeyAdapter(){
			public void keyPressed(KeyEvent ke) 
			{
				//listen to the left key
				if(ke.getKeyCode()==KeyEvent.VK_LEFT)
				{
					if(racketX>0)		
					{
						racketX-=20;
					}
				}
				
				//listen to the left key
				if(ke.getKeyCode()==KeyEvent.VK_RIGHT)
				{
					if(racketX<tableX-racketWidth)		
					{
						racketX+=20;
					}
				}
			}
		};
		
		f.addKeyListener(ka);
		tableArea.addKeyListener(ka);

		ActionListener al = new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//if the ball touch the right or left edge of the table area
				if(ballX<=0||ballX>=(tableX-ballRad))
				{
					speedX=-speedX;
				}
				//if the ball touch the bottom side of the table
				if(ballY>tableY-ballRad&&(ballX<racketX-ballRad||ballX>racketX+racketWidth))
				{
					timer.stop();
					gameIsOver=true;
					tableArea.repaint();
				}
				//the ball touch the racket
				else if(ballY<=0||(ballY>racketY-ballRad&&ballX<=racketX+racketWidth&&ballX>racketX))
				{
					speedY=-speedY;
					speedX+=3;
				}

				ballY +=speedY;
				ballX +=speedX;
				tableArea.repaint();
			}
		};
		timer = new javax.swing.Timer(10,al);
		timer.start();
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new AWTPinBallTest().init();  	
	}
}
