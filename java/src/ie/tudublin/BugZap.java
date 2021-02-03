package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	public void settings()
	{
		size(500, 500);
	}

    public void setup() 
    {
		
	}

	float playerX = 250, playerY = 460;
	float  playerWidth = 40;
	float halfPlayerWidth = playerWidth / 2;
	float playerSpeed = 10;

	float bugX = 250, bugY = 60; 
	float bugWidth = 30;
	float halfBugWidth = bugWidth / 2;

	public void drawPlayer(float x, float y, float w)
	{		
		 stroke(255);
		 float playerHeight = w / 2;
		 line(x - halfPlayerWidth, y + playerHeight, x + halfPlayerWidth, y + playerHeight);
		 line(x - halfPlayerWidth, y + playerHeight, x - halfPlayerWidth, y + playerHeight * 0.5f);
		 line(x + halfPlayerWidth, y + playerHeight, x + halfPlayerWidth, y + playerHeight * 0.5f);
		 
		 line(x - halfPlayerWidth, y + playerHeight * 0.5f, x - (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f);
		 line(x + halfPlayerWidth, y + playerHeight * 0.5f, x + (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f);
		 
		 line(x - (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f, x + (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f);
		 
		 line(x, y, x, y + playerHeight * 0.3f); 
	}

	void drawBug(float x, float y)
	{
		// Draw the bug
		stroke(255);
		float saucerHeight = bugWidth * 0.7f;
		line(x, y - saucerHeight, x - halfBugWidth, y);
		line(x, y - saucerHeight, x +  halfBugWidth, y);		
		line(x - halfBugWidth, y, x - halfBugWidth, y);
		line(x - halfBugWidth, y, x + halfBugWidth, y);
		float feet = bugWidth * 0.1f;
		line(x - feet, y, x - halfBugWidth, y + halfBugWidth);
		line(x  + feet, y, x + halfBugWidth, y + halfBugWidth);

		
		feet = bugWidth * 0.3f;
		line(x - feet, y, x - halfBugWidth, y + halfBugWidth);
		line(x  + feet, y, x + halfBugWidth, y + halfBugWidth);

		float eyes  = bugWidth * 0.1f;
		line(x - eyes, y - eyes, x - eyes, y - eyes * 2f);
		line(x + eyes, y - eyes, x + eyes, y - eyes * 2f);
	
	}

	void moveBug()
	{
		if ((frameCount % 30) == 0)
		{
			bugX += random(-60, +60);
			if (bugX < halfBugWidth )
			{
			  bugX = halfBugWidth;
			}
			
			if (bugX + halfBugWidth > width)
			{
			  bugX = width - halfBugWidth;
			}
			bugY +=2;
		}
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			if (playerX > halfPlayerWidth)
			{
				playerX -= playerSpeed;
			}
		}
		if (keyCode == RIGHT)
		{
			if (playerX < width - halfPlayerWidth)
			{
				playerX += playerSpeed;
			}
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}

	public void draw()
	{
		background(0);
		fill(255);
		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY);
		moveBug();
	}
}
