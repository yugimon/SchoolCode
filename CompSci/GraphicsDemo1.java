//800 by 600
//(start X-axis,start Y-axis,whidth,height)
//(start X-axis,start Y-axis,whidth,height)
//(First Letter X-axis,First Letter Y-axis)
// the one drawn last is drawn on top


import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		g.drawRect(200,20,100,200);  // draw a rectangle
		g.fillOval(200,20,100,200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.drawOval(200,430,200,100);
		g.setColor(Color.red);
		g.fillRect(735,515,50,50);
		
		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("GraphicsDemo1");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo1 canvas = new GraphicsDemo1();
		win.add( canvas );
		win.setVisible(true);
	}
}
