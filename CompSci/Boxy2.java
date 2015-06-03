import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color    x    y
		drawBox( window, Color.RED, 200, 300 );
		drawBox( window, Color.BLACK, 353, 13 );
		drawBox( window, Color.BLUE, 622, 200 );
		drawBox( window, Color.CYAN, 534, 435 );
		drawBox( window, Color.GRAY, 123, 352 );
		drawBox( window, Color.GREEN, 50, 214 );
		drawBox( window, Color.MAGENTA, 789, 128 );
		drawBox( window, Color.ORANGE, 297, 431 );
		drawBox( window, Color.PINK, 666, 333 );
		drawBox( window, Color.YELLOW, 222, 22 );
		drawBox( window, Color.LIGHT_GRAY, 564, 312 );

		// draw ten more boxes -- different colors, different places
	}
	
	public void drawBox( Graphics window, Color c, int x, int y )
	{
		// already finished; do not modify
		
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
