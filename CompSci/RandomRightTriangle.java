import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class RandomRightTriangle extends Canvas
{
	public void paint( Graphics t )
    {
    	int a, b, c, x, y, j;
    	
    	for( j = 1 ; j <= 500 ; j++ )
    	{
    		a = 1+(int)(Math.random()*254);
    		b = 1+(int)(Math.random()*254);
    		c = 1+(int)(Math.random()*254);
    		x = 30+(int)(Math.random()*900);
    		y = 1+(int)(Math.random()*600);
    		
    		Polygon tri = new Polygon();
    		tri.addPoint(x, y); 
    		tri.addPoint(x-30, y+50); 
    		tri.addPoint(x+30, y+50); 
    	
    		Color clr = new Color(a,b,c);
    		t.setColor(clr);
        	t.fillPolygon(tri);
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