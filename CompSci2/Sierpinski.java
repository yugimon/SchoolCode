import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class Sierpinski extends Canvas
{
	public void paint( Graphics g )
	{
		int a, x=512, x1=512,x2=146,x3=876,y=382,y1=109,y2=654,y3=654,dx=0,dy=0;
		
		for(int q=1;q<= 50009; q++)
		{
			try {
				Thread.sleep(1);
			}
			catch ( Exception e )
			{ 
			
			}
			g.drawLine(x,y,x,y);
			a = 1+(int)(Math.random()*3);
			if (a == 1)
			{
				dx = x - x1;
				dy = y - y1;
			}
			else if (a == 2)
			{
				dx = x - x2;
				dy = y - y2;
			}
			else if (a == 3)
			{
				dx = x - x3;
				dy = y - y3;
			}
			x = x - dx/2;
			y = y - dy/2;
		}
		g.drawString("Sierpinski Triangle", 462, 484);
		
	}
	
	public static void main( String[] args )
	{
		JFrame win = new JFrame("Sierpinski");
		win.setSize(1000,700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new Sierpinski() );
		win.setVisible(true);
	}
}