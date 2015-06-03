//© A+ Computer Science  -  www.apluscompsci.com

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Aplus01Robot extends Canvas
{
   public Aplus01Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Aplus01Robot LAB ", 35, 35 );

      //call head method
	  head(window);
      
      //call other methods
	  upperBody(window);
	  lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
	  
	  window.setColor(Color.GREEN);
	window.fillOval( 340,125,20,20);
		
	window.setColor(Color.GREEN);
	window.fillOval( 440,125,20,20);
		
	window.setColor(Color.BLACK);
	window.fillOval( 390, 150,20,10);
		
	window.setColor(Color.RED);
	window.drawArc(350,95,100,100,212,120);


	//add more code here
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
		window.setColor(Color.BLUE);
		window.fillRect(340,225,125,100);
		
		window.setColor(Color.BLACK);
		window.drawLine(240,175,340,225);
		window.drawLine(565,175,465,225);
   }

   public void lowerBody( Graphics window )
   {

		//add more code here
		window.setColor(Color.GRAY);
		window.fillRect(340,350,125,100);
		window.setColor(Color.YELLOW);
		window.drawRect(340,350,125,100);
		
		window.setColor(Color.BLACK);
		window.drawLine(340,450,240,540);
		window.drawLine(465,450,565,540);
		

   }
}
