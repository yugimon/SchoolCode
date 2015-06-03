import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class RandomRightTriangle extends Canvas
{
	public void paint( Graphics g )
	{
		int q, w, e, z, x, c;
		
		for( c =1; c <= 500; c++)
		{
			q = 1+(int)(Math.random()*254);
			w = 1+(int)(Math.random()*254);
			e = 1+(int)(Math.random()*254);
			z = 30+(int)(Math.random()*900);
			x = 1+(int)(Math.random()*600);
			
			Polygon tri = new Polygon();
			tri.addPoint(z, x);
			tri.addPoint(z-30, x+50);
			tri.addPoint(z+30, x+50);
			
			Color col = new Color(q,w,e);
			g.setColor(col);
			g.fillPolygon(tri);
		}
	}
	
	public static void main( String[] args )
	{
		JFrame win = new JFrame("RandomRightTriangle");
		win.setSize(1000,700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new RandomRightTriangle() );
		win.setVisible(true);
	}
}