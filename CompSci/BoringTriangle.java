import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class BoringTriangle extends Canvas
{
	public void paint( Graphics g )
    {
    	Polygon tri = new Polygon();
    	tri.addPoint(111, 111); 
    	tri.addPoint(111, 333); 
    	tri.addPoint(222, 333); 
    	
    	Color myPurp = new Color(200,0,255);
    	g.setColor(myPurp);
        g.fillPolygon(tri);
    	
    }
	public static void main( String[] args )
	{
		JFrame win = new JFrame("BoringTriangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new BoringTriangle() );
        win.setVisible(true);
	}
}