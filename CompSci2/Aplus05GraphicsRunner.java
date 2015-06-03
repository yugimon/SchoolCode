//© A+ Computer Science  -  www.apluscompsci.com

import javax.swing.JFrame;

public class Aplus05GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Aplus05GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new Aplus05AnimatedCar(WIDTH, HEIGHT));
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Aplus05GraphicsRunner run = new Aplus05GraphicsRunner();
	}
}
