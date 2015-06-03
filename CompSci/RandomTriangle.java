import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class RandomTriangle extends Canvas
{
	public void paint( Graphics t )
    {
    	int a, b, c, d, e, f, g, h, i, j;
    	
    	for( j = 1 ; j <= 500 ; j++ )
    	{
    		a = 1+(int)(Math.random()*254);
    		b = 1+(int)(Math.random()*254);
    		c = 1+(int)(Math.random()*254);
    		d = 1+(int)(Math.random()*1000);
    		e = 1+(int)(Math.random()*700);
    		f = 1+(int)(Math.random()*1000);
    		g = 1+(int)(Math.random()*700);
    		h = 1+(int)(Math.random()*1000);
    		i = 1+(int)(Math.random()*700);
    		Polygon tri = new Polygon();
    		tri.addPoint(d, e); 
    		tri.addPoint(f, g); 
    		tri.addPoint(h, i); 
    	
    		Color clr = new Color(a,b,c);
    		t.setColor(clr);
        	t.fillPolygon(tri);
    	}
    	
    }
	public static void main( String[] args )
	{
		JFrame win = new JFrame("RandomTriangle");
        win.setSize(1000,700);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new RandomTriangle() );
        win.setVisible(true);
	}
}