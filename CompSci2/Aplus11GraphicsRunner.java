//© A+ Computer Science  -  www.apluscompsci.com

import javax.swing.JFrame; 

public class Aplus11GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Aplus11GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new Aplus11ColoredBoxes());					
						
		//getContentPane().add(new Aplus11RandomColoredBoxes());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Aplus11GraphicsRunner run = new Aplus11GraphicsRunner();
	}
}
