package arkanoid;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class logic extends JFrame implements KeyListener
{
	final int windowWidth = 1000;
	final int windowHeight = 700;
	int score = 0;
	
	int gBallSize = 20;
	int BrickWidth = 82; 
	int BrickHeight = 40;
	int velocityX = 6;
	int velocityY = 7;
	int paddleX = (windowWidth/2) - 75;
	int gPaddleWidth = 150;
	Brick[] Brick = new Brick[40];
	int bricks = 0;
	boolean gameOver = false;
	
	int xBallPos = (int) Math.floor(Math.random()*((windowWidth-200)-200+1)+200);
	int yBallPos = (windowHeight/2) - 50;
	
	
	
	public class Brick 
	{
		int x;
		int y;
	}
		
	boolean isBrickCollision(Brick Brick) 
	{
		if (yBallPos >= Brick.y-gBallSize &&
			yBallPos < Brick.y + BrickHeight &&
			xBallPos > Brick.x-gBallSize && 
			xBallPos < Brick.x + BrickWidth) 
		{
			score++;
			return true;
		}
		return false;
	}
	
	boolean isPaddleCollision() 
	{
		if (xBallPos + gBallSize > paddleX &&
			xBallPos < paddleX + gPaddleWidth &&
			yBallPos >= (windowHeight - 80) && 
			yBallPos < (windowHeight - 60)) 
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			if(paddleX >= 0-gPaddleWidth && paddleX < windowWidth - gPaddleWidth)
			{
				paddleX = paddleX + 30;
			}			
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			if(paddleX >= 0 && paddleX < windowWidth - gPaddleWidth/2)
			{
				paddleX = paddleX - 30;
			}	
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	
	
	
	
}
