import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class MotivationalPoster extends Canvas
{
	Image hangGrump;
	
	public MotivationalPoster() throws Exception
	{
		hangGrump = ImageIO.read( new File("HangInThereGrumpy.jpg") );
	}
	
	public void paint( Graphics g )
	{
		//           Image  , x,  y, this
		g.drawImage(hangGrump,0,0,this);
		
		g.setFont(Font.decode("Calibri-BOLDITALIC-60"));
        g.drawString("Hang in there.", 25, 50);
        
        g.setFont(Font.decode("Calibri-BOLDITALIC-100"));
        g.drawString("NO!", 150, 520);
		
	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("MotivationalPoster");
		win.setSize(425,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new MotivationalPoster() );
		win.setVisible(true);
	}


}
