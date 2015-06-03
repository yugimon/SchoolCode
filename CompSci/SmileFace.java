import java.awt.*;
import javax.swing.JFrame;

public class SmileFace extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.yellow);
        g.fillOval(250,150,300,300);
        g.setColor(Color.black);
        g.fillOval(325,225,50,50);
        g.setColor(Color.black);
        g.fillOval(425,225,50,50);
        g.drawArc(275,122,250,250,225,90);
		
		//Grid
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
    		g.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
    		g.drawString( String.valueOf(Y), 28, Y );
		// lines
		g.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
    		g.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
    		g.drawLine(0,Y,799,Y);    // vertical
	}
	
	public static void main( String[] args )
    {
        JFrame win = new JFrame("SmileFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmileFace canvas = new SmileFace();
        win.add( canvas );
        win.setVisible(true);
    }
}