import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		g.setColor(Color.yellow);
        g.fillOval(x,y,100,100);
        g.setColor(Color.blue);
        g.fillOval(x+25,y+25,12,12);
        g.setColor(Color.blue);
        g.fillOval(x+65,y+25,12,12);
        g.setColor(Color.red);
        g.drawArc(x+15,y+10,75,75,195,150);
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}
