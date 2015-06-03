//© A+ Computer Science  -  www.apluscompsci.com

import java.awt.Color;
import java.awt.Graphics;

public class Aplus01Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Aplus01Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
		window.setColor(color);
		//bottom center pixel
		window.fillRect(xPos, yPos, width, height);
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()
		window.fillRect(xPos, yPos-height, width, height);
		window.fillRect(xPos, yPos-height*2, width, height);
		window.fillRect(xPos, yPos-height*3, width, height);
		window.fillRect(xPos, yPos-height*4, width, height);
		window.fillRect(xPos, yPos-height*5, width, height);
		window.fillRect(xPos, yPos-height*8, width, height);
		window.fillRect(xPos, yPos-height*9, width, height);
		window.fillRect(xPos, yPos-height*10, width, height);
		window.fillRect(xPos, yPos-height*11, width, height);
		window.fillRect(xPos, yPos-height*12, width, height);
		window.fillRect(xPos, yPos-height*13, width, height);
		window.fillRect(xPos, yPos-height*14, width, height);
		window.fillRect(xPos, yPos-height*15, width, height);
		
		//left half
		window.fillRect(xPos-width, yPos-height*2, width, height);
		window.fillRect(xPos-width, yPos-height*3, width, height);
		window.fillRect(xPos-width, yPos-height*4, width, height);
		window.fillRect(xPos-width, yPos-height*7, width, height);
		window.fillRect(xPos-width, yPos-height*8, width, height);
		window.fillRect(xPos-width, yPos-height*9, width, height);
		window.fillRect(xPos-width, yPos-height*10, width, height);
		window.fillRect(xPos-width, yPos-height*11, width, height);
		window.fillRect(xPos-width, yPos-height*12, width, height);
		window.fillRect(xPos-width*2, yPos-height*8, width, height);
		window.fillRect(xPos-width*2, yPos-height*7, width, height);
		window.fillRect(xPos-width*2, yPos-height*6, width, height);
		window.fillRect(xPos-width*2, yPos-height*5, width, height);
		window.fillRect(xPos-width*2, yPos-height*4, width, height);
		window.fillRect(xPos-width*3, yPos-height*6, width, height);
		window.fillRect(xPos-width*3, yPos-height*5, width, height);
		window.fillRect(xPos-width*3, yPos-height*4, width, height);
		window.fillRect(xPos-width*3, yPos-height*3, width, height);
		window.fillRect(xPos-width*4, yPos-height*3, width, height);
		window.fillRect(xPos-width*4, yPos-height*4, width, height);
		window.fillRect(xPos-width*4, yPos-height*5, width, height);
		window.fillRect(xPos-width*4, yPos-height*7, width, height);
		window.fillRect(xPos-width*4, yPos-height*8, width, height);
		window.fillRect(xPos-width*5, yPos-height*3, width, height);
		window.fillRect(xPos-width*5, yPos-height*4, width, height);
		window.fillRect(xPos-width*5, yPos-height*2, width, height);
		window.fillRect(xPos-width*6, yPos-height*3, width, height);
		window.fillRect(xPos-width*6, yPos-height, width, height);
		window.fillRect(xPos-width*6, yPos-height*2, width, height);
		window.fillRect(xPos-width*7, yPos-height*3, width, height);
		window.fillRect(xPos-width*7, yPos-height*4, width, height);
		window.fillRect(xPos-width*7, yPos-height*2, width, height);
		window.fillRect(xPos-width*7, yPos-height, width, height);
		window.fillRect(xPos-width*7, yPos, width, height);
		window.fillRect(xPos-width*7, yPos-height*5, width, height);
		
		//right half
		window.fillRect(xPos+width, yPos-height*2, width, height);
		window.fillRect(xPos+width, yPos-height*3, width, height);
		window.fillRect(xPos+width, yPos-height*4, width, height);
		window.fillRect(xPos+width, yPos-height*7, width, height);
		window.fillRect(xPos+width, yPos-height*8, width, height);
		window.fillRect(xPos+width, yPos-height*9, width, height);
		window.fillRect(xPos+width, yPos-height*10, width, height);
		window.fillRect(xPos+width, yPos-height*11, width, height);
		window.fillRect(xPos+width, yPos-height*12, width, height);
		window.fillRect(xPos+width*2, yPos-height*8, width, height);
		window.fillRect(xPos+width*2, yPos-height*7, width, height);
		window.fillRect(xPos+width*2, yPos-height*6, width, height);
		window.fillRect(xPos+width*2, yPos-height*5, width, height);
		window.fillRect(xPos+width*2, yPos-height*4, width, height);
		window.fillRect(xPos+width*3, yPos-height*6, width, height);
		window.fillRect(xPos+width*3, yPos-height*5, width, height);
		window.fillRect(xPos+width*3, yPos-height*4, width, height);
		window.fillRect(xPos+width*3, yPos-height*3, width, height);
		window.fillRect(xPos+width*4, yPos-height*3, width, height);
		window.fillRect(xPos+width*4, yPos-height*4, width, height);
		window.fillRect(xPos+width*4, yPos-height*5, width, height);
		window.fillRect(xPos+width*4, yPos-height*7, width, height);
		window.fillRect(xPos+width*4, yPos-height*8, width, height);
		window.fillRect(xPos+width*5, yPos-height*3, width, height);
		window.fillRect(xPos+width*5, yPos-height*4, width, height);
		window.fillRect(xPos+width*5, yPos-height*2, width, height);
		window.fillRect(xPos+width*6, yPos-height*3, width, height);
		window.fillRect(xPos+width*6, yPos-height, width, height);
		window.fillRect(xPos+width*6, yPos-height*2, width, height);
		window.fillRect(xPos+width*7, yPos-height*3, width, height);
		window.fillRect(xPos+width*7, yPos-height*4, width, height);
		window.fillRect(xPos+width*7, yPos-height*2, width, height);
		window.fillRect(xPos+width*7, yPos-height, width, height);
		window.fillRect(xPos+width*7, yPos, width, height);
		window.fillRect(xPos+width*7, yPos-height*5, width, height);
		
		
		window.setColor(Color.RED);
		
		window.fillRect(xPos, yPos-height*6, width, height);
		window.fillRect(xPos, yPos-height*7, width, height);
		window.fillRect(xPos-width, yPos-height*6, width, height);
		window.fillRect(xPos+width, yPos-height*6, width, height);
		window.fillRect(xPos-width, yPos-height*5, width, height);
		window.fillRect(xPos+width, yPos-height*5, width, height);
		
		window.fillRect(xPos-width*2, yPos-height*3, width, height);
		window.fillRect(xPos-width*2, yPos-height*2, width, height);
		window.fillRect(xPos-width*2, yPos-height*1, width, height);
		window.fillRect(xPos-width*3, yPos-height*2, width, height);
		window.fillRect(xPos-width*3, yPos-height*1, width, height);
		
		window.fillRect(xPos+width*2, yPos-height*3, width, height);
		window.fillRect(xPos+width*2, yPos-height*2, width, height);
		window.fillRect(xPos+width*2, yPos-height*1, width, height);
		window.fillRect(xPos+width*3, yPos-height*2, width, height);
		window.fillRect(xPos+width*3, yPos-height*1, width, height);
		
		window.fillRect(xPos-width*7, yPos-height*6, width, height);
		window.fillRect(xPos-width*7, yPos-height*7, width, height);
		window.fillRect(xPos-width*4, yPos-height*9, width, height);
		window.fillRect(xPos-width*4, yPos-height*10, width, height);
		
		window.fillRect(xPos+width*7, yPos-height*6, width, height);
		window.fillRect(xPos+width*7, yPos-height*7, width, height);
		window.fillRect(xPos+width*4, yPos-height*9, width, height);
		window.fillRect(xPos+width*4, yPos-height*10, width, height);
		
		window.setColor(Color.BLUE);
		
		window.fillRect(xPos-width*4, yPos-height*6, width, height);
		window.fillRect(xPos-width*3, yPos-height*7, width, height);
		
		window.fillRect(xPos+width*4, yPos-height*6, width, height);
		window.fillRect(xPos+width*3, yPos-height*7, width, height);
	  

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}
