import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
	public void paint( Graphics g )
	{
		g.drawOval(250,150,350,350);
		g.fillOval(400,300,50,50);
		g.setFont(new Font("Consolas", Font.PLAIN, 36));
		g.drawString("12", 405, 190);
		g.drawString("9", 260, 335);
		g.drawString("6", 415, 490);
		g.drawString("3", 570, 335);
		g.drawLine(425,325,425,195);
		g.drawLine(425,325,505,325);
		
	}
	
	public static void main( String[] args )
    {
        JFrame win = new JFrame("ClockFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add( canvas );
        win.setVisible(true);
    }
}