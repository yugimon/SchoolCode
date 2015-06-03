//© A+ Computer Science  -  www.apluscompsci.com

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplus01ShapePanel extends JPanel
{
	public Aplus01ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Aplus01Shape
		Aplus01Shape s = new Aplus01Shape(300, 300, 10, 10, Color.BLACK);
		//tell your shape to draw
		s.draw(window); 

		//instantiate a Aplus01Shape
		Aplus01Shape f = new Aplus01Shape(120, 150, 12, 5, Color.GREEN);
		//tell your shape to draw
		f.draw(window);

		//instantiate a Aplus01Shape
		Aplus01Shape g = new Aplus01Shape(660, 423, 6, 20, Color.YELLOW);
		//tell your shape to draw
		g.draw(window);
	}
}
