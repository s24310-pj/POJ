package arkanoid;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.Timer;

public class drawer extends logic implements KeyListener 
{
	
	DrawPanel game = new DrawPanel();
	
	
	
	public drawer() 
	{
		add(game);
		addKeyListener(this);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		for(int i = 1; i <= 10; i++) 
		{
			for(int j = 2; j <= 5; j++) 
			{
				Brick[bricks] = new Brick();
				Brick[bricks].x = i * BrickWidth;
				Brick[bricks].y = j * BrickHeight;
				bricks++;
			}
		}
		
		ActionListener listener = new AbstractAction() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(!gameOver) 
				{					
					if(yBallPos > windowHeight || score >= bricks) 
					{
						gameOver = true;
					}
					
					if(yBallPos < 0) 
					{
						velocityY = -velocityY;
					}
					
					xBallPos = xBallPos + velocityX;
					
					if(xBallPos > windowWidth-gBallSize)
					{
						velocityX = -velocityX;
					}
					if(xBallPos < 0)
					{
						velocityX = -velocityX;
					}
					
					yBallPos = yBallPos + velocityY;
					
					for(int i = 0; i < bricks; i++) 
					{
						if(isBrickCollision(Brick[i])) 
						{
							Brick[i].x = -300;
							velocityY = -velocityY;
						}
					}
					if(isPaddleCollision()) 
					{
						velocityY = -velocityY;
					}
				}
				
				game.repaint();
			}
		};
		
		Timer timer = new Timer(35, listener);
		timer.start();
		
	}
	
	
	private class DrawPanel extends JPanel
	{				
		protected void paintComponent(Graphics g) 
		{
			super.paintComponent(g);
			
			Graphics gBall = g;
			gBall.setColor(Color.magenta);
			gBall.fillOval(xBallPos, yBallPos, gBallSize, gBallSize);
				
			g.setFont(new Font("Tahoma", Font.BOLD, 20));
			g.drawString("Your score : " + score, (windowWidth/2)-50, 20);
			
			Graphics gPaddle = g;
			gPaddle.setColor(Color.orange);
			gPaddle.fillRect(paddleX, (windowHeight - 60), gPaddleWidth, 10);
			
			Graphics gBrick = g;
			for (int i = 0; i < bricks; i++) 
			{
				gBrick.setColor(Color.green);
				gBall.fillRect(Brick[i].x, Brick[i].y, BrickWidth, BrickHeight);
				gBrick.setColor(Color.white);
				gBall.drawRect(Brick[i].x, Brick[i].y, BrickWidth, BrickHeight);
			}
			
			if (gameOver) 
			{
				if (score >= bricks)
				{
					g.setColor(Color.black);
					g.setFont(new Font("Tahoma", Font.PLAIN, 20));
					g.drawString("Congratulations, You WIN!!! ", ((windowWidth/2) - 100), 300);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(new Font("Tahoma", Font.PLAIN, 20));
					g.drawString("You lost, your score is: " + score, (windowWidth/2)-100, 300);
				}
			}
			
		
		}
		public Dimension getPreferredSize() 
		{
			return new Dimension(windowWidth, windowHeight);
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			@Override
			public void run() 
			{
				new drawer();
			}
		});
	}
		
}















