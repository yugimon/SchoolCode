import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageDemo extends Canvas
{
	Image coolFace, mickey;
	
	public ImageDemo() throws Exception
	{
		coolFace = ImageIO.read( new File("mitch.png") );
		mickey = ImageIO.read( new File("MMC.jpg") );
		
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
	}
	
	public void paint( Graphics g )
	{
		//           Image  , x,  y, this
		g.drawImage(coolFace,100,100,this);
		g.drawImage(mickey,400,400,this);
		
		// And, just for fun, let's give me demon horns! These demon horns designed by Logan K in 2014.
		g.setColor( Color.red );
		g.drawLine(108,108,95,80);
		g.drawLine(115,105,95,80);
		g.drawLine(145,112,150,80);
		g.drawLine(138,105,150,80);
	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Image Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ImageDemo() );
		win.setVisible(true);
	}


}
