//© A+ Computer Science  -  www.apluscompsci.com

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Aplus01SmileyFace extends Canvas
{
   public Aplus01SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
		window.setColor(Color.BLUE);
		window.drawString("SMILEY FACE LAB ", 35, 35);
	  
		window.setColor(Color.YELLOW);
		window.fillOval( 210, 100, 400, 400 );

		//add more code here
		window.setColor(Color.GREEN);
		window.fillOval( 270,200,90,45);
		
		window.setColor(Color.GREEN);
		window.fillOval( 465,200,90,45);
		
		window.setColor(Color.BLACK);
		window.fillOval( 390, 300,45,45);
		
		window.setColor(Color.RED);
		window.drawArc(285,175,250,250,212,120);
		
		
		


   }
}
