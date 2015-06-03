//© A+ Computer Science  -  www.apluscompsci.com
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Aplus01BigHouse extends Canvas
{
   public Aplus01BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
	  bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );
	  
	  window.setColor(Color.WHITE);
      window.fillRect( 350, 450, 100, 250 );
	  
	  window.setColor(Color.YELLOW);
      window.fillRect( 250, 250, 100, 100 );
	  
	  window.setColor(Color.YELLOW);
      window.fillRect( 450, 250, 100, 100 );
	  
		Polygon roof = new Polygon();
		roof.addPoint(200, 200);
		roof.addPoint(600, 200);
		roof.addPoint(400, 75);
		window.setColor(Color.GREEN);
		window.fillPolygon(roof);

   }
}
