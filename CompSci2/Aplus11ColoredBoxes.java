//© A+ Computer Science  -  www.apluscompsci.com

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

class Aplus11ColoredBoxes extends Canvas
{
	public Aplus11ColoredBoxes()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11g ", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		//nested loops to draw the pretty boxes
		for (int q=100; q<595;q+=55){
			for (int w=50; w<545;w+=55){
				window.setColor(Color.BLUE);
				window.fillRect(w,q,1,1);
				
			}
		}
			
	}
}
