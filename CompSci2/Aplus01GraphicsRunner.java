//© A+ Computer Science  -  www.apluscompsci.com

import javax.swing.JFrame;

public class Aplus01GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Aplus01GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new Aplus01SmileyFace());
		//getContentPane().add(new Aplus01BigHouse());
		//getContentPane().add(new Aplus01Robot());
		getContentPane().add(new Aplus01ShapePanel());
		
		//add other classes to run them 
		//Aplus01BigHouse, Aplus01Robot, or Aplus01ShapePanel 

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		Aplus01GraphicsRunner run = new Aplus01GraphicsRunner();
	}
}
