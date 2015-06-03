/*
What I did:
300 Point Version
Draw a straight line with a visible "elastic band" approach.
Provide an eraser that removes portions of a drawing.
Draw a rectangle with a visible "elastic band" approach.
Draw an oval with a visible "elastic band" approach.
Implement a "paint bucket" tool which fills in an existing shape.
*/
import java.awt.AlphaComposite;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Paint extends Canvas implements MouseMotionListener , MouseListener
{
	private Color curColor = Color.black, clickColor;
	private int lastX , lastY ,dragX , dragY , size = 5, tool =1;
	private Image vThing, vThing2;
	private BufferedImage bImage;
	private Graphics2D gBack, gTool, gLines;
	
	
	public void init()
	{
		vThing = createImage(getWidth(), getHeight());
		//vThing2 = createImage(700, 515);
		bImage = new BufferedImage(getWidth(), getHeight(),BufferedImage.TYPE_INT_ARGB);
		
		gTool = (Graphics2D)vThing.getGraphics();
		gLines = (Graphics2D)vThing.getGraphics();
		//gBack = (Graphics2D)vThing2.getGraphics();
		
	}
	
	public Paint()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void update( Graphics g)
	{
		paint(g);
	}
	public void paint( Graphics g )
	{
		
		
		//!canvas
		gTool.setColor(Color.gray);
		gTool.fillRect(0,0,50,768);
		gTool.fillRect(0,0,800,100);
		gTool.fillRect(0,615,800,125);
		gTool.fillRect(750,0,50,768);
		
		
		//tool bar
		gTool.setColor(Color.darkGray);
		gTool.fillRect(800,0,224,768);
		gTool.setColor(Color.black);
		gTool.drawString("Colors:", 820, 150);
		gTool.setColor(Color.red);
		gTool.fillRect(820,160,30,30);
		gTool.setColor(Color.yellow);
		gTool.fillRect(880,160,30,30);
		gTool.setColor(Color.blue);
		gTool.fillRect(940,160,30,30);
		gTool.setColor(Color.black);
		gTool.fillRect(850,210,30,30);
		gTool.setColor(Color.green);
		gTool.fillRect(910,210,30,30);
		
		gTool.setColor(Color.black);
		gTool.drawString("Sizes:", 820, 300);
		gTool.setColor(curColor);
		gTool.fillRect(825,350,5,5);
		gTool.fillRect(880,350,10,10);
		gTool.fillRect(940,350,50,50);
		
		gTool.setColor(Color.black);
		gTool.drawString("Tools:", 820, 450);
		gTool.setColor(Color.white);
		gTool.fillRect(815,460,40,30);
		gTool.fillRect(875,460,40,30);
		gTool.fillRect(935,460,40,30); 
		gTool.fillRect(815,510,40,30);
		gTool.fillRect(875,510,40,30);
		gTool.fillRect(935,510,40,30);
		gTool.setColor(Color.black);
		gTool.drawString("Brush", 815, 475);
		gTool.drawString("Erase", 875, 475);
		gTool.drawString("Bucket", 935, 475);
		gTool.drawString("Line", 815, 525);
		gTool.drawString("Rect", 875, 525);
		gTool.drawString("Oval", 935, 525);
		
		g.drawImage(vThing, 0, 0, this);
		
		//canvas
		/*float alpha = 0.1f;
        AlphaComposite alcom = AlphaComposite.getInstance(
        AlphaComposite.SRC_OVER, alpha);
        gTool.setComposite(alcom);
		gTool.fillRect(50,100,700,515);*/
		//draw line
		if (tool == 1){
		gLines.setColor(curColor);
		gLines.fillRect(lastX-(size/2),lastY-(size/2),size,size);
		}
		
		if (tool == 2){
		gLines.setColor(Color.white);
		gLines.fillRect(lastX-(size/2),lastY-(size/2),size,size);
		}
		
		
		
		
		
		//g.drawImage(vThing2,50,100,this);
		
		
		if (tool == 4 ){
			g.setColor(curColor);
			g.drawLine(dragX,dragY,lastX,lastY);
		}
		
		if(tool == 5){
			g.setColor(curColor);
			if( lastX > dragX && lastY > dragY){
				g.drawRect(dragX,dragY,lastX-dragX,lastY-dragY);
			}
			else if( lastX < dragX && lastY > dragY){
				g.drawRect(lastX,dragY,dragX-lastX,lastY-dragY);
			}
			else if( lastX > dragX && lastY < dragY){
				g.drawRect(dragX,lastY,lastX-dragX,dragY-lastY);
			}
			else if( lastX < dragX && lastY < dragY){
				g.drawRect(lastX,lastY,dragX-lastX,dragY-lastY);
			}
			
		}
		
		if(tool == 6){
			g.setColor(curColor);
			if( lastX > dragX && lastY > dragY){
				g.drawOval(dragX,dragY,lastX-dragX,lastY-dragY);
			}
			else if( lastX < dragX && lastY > dragY){
				g.drawOval(lastX,dragY,dragX-lastX,lastY-dragY);
			}
			else if( lastX > dragX && lastY < dragY){
				g.drawOval(dragX,lastY,lastX-dragX,dragY-lastY);
			}
			else if( lastX < dragX && lastY < dragY){
				g.drawOval(lastX,lastY,dragX-lastX,dragY-lastY);
			}
			
		}
		
		
		
	}
	
	public void bucket(int x, int y)
	{
		
			bImage = (BufferedImage) (vThing ); 
		Color pixelColor = new Color(bImage.getRGB(x,y));
		if ( pixelColor.equals(clickColor))
		{
			gLines.setColor(curColor);
			gLines.fillRect(x,y,1,1);
			if (x < 750 && x > 50){
				bucket(x+1,y);
				bucket(x-1,y);
			}
			if ( y < 615 && y > 100){
				bucket(x,y+1);
				bucket(x,y-1);
			}
		}
	}
	
	
	public void mouseDragged( MouseEvent evt )
	{
		
		if ((evt.getX() < 750 && evt.getX() > 50) && ( evt.getY() < 615 && evt.getY() > 100)) {	
			lastX = evt.getX();
			lastY = evt.getY();
		}
		
		
		

		repaint();
	}
	public void mouseMoved( MouseEvent evt )
	{
		
	}
	
	public void mouseClicked( MouseEvent evt )
	{
		if ((evt.getX() < 750 && evt.getX() > 50) && ( evt.getY() < 615 && evt.getY() > 100)) {	
			lastX = evt.getX();
			lastY = evt.getY();
		}
		
		
		
		if ( (evt.getX() >= 820 && evt.getX() <= 850) && (evt.getY() >= 160 && evt.getY() <= 190))
			curColor = Color.red;
		else if ( (evt.getX() >= 880 && evt.getX() <= 910) && (evt.getY() >= 160 && evt.getY() <= 190))
			curColor = Color.yellow;
		else if ( (evt.getX() >= 940 && evt.getX() <= 970) && (evt.getY() >= 160 && evt.getY() <= 190))
			curColor = Color.blue;
		else if ( (evt.getX() >= 850 && evt.getX() <= 880) && (evt.getY() >= 210 && evt.getY() <= 240))
			curColor = Color.black;
		else if ( (evt.getX() >= 910 && evt.getX() <= 940) && (evt.getY() >= 210 && evt.getY() <= 240))
			curColor = Color.green;
			
		if ( (evt.getX() >= 825 && evt.getX() <= 830) && (evt.getY() >= 350 && evt.getY() <= 355))
			size = 5;
		else if ( (evt.getX() >= 880 && evt.getX() <= 890) && (evt.getY() >= 350 && evt.getY() <= 360))
			size = 10;
		else if ( (evt.getX() >= 940 && evt.getX() <= 990) && (evt.getY() >= 350 && evt.getY() <= 400))
			size = 50;
			
		if ( (evt.getX() >= 820 && evt.getX() <= 850) && (evt.getY() >= 460 && evt.getY() <= 490))
			tool = 1;
		else if ( (evt.getX() >= 880 && evt.getX() <= 910) && (evt.getY() >= 460 && evt.getY() <= 490))
			tool = 2;
		else if ( (evt.getX() >= 940 && evt.getX() <= 970) && (evt.getY() >= 460 && evt.getY() <= 490))
			tool = 3;
		else if ( (evt.getX() >= 820 && evt.getX() <= 850) && (evt.getY() >= 510 && evt.getY() <= 540))
			tool = 4;
		else if ( (evt.getX() >= 880 && evt.getX() <= 910) && (evt.getY() >= 510 && evt.getY() <= 540))
			tool = 5;
		else if ( (evt.getX() >= 940 && evt.getX() <= 970) && (evt.getY() >= 510 && evt.getY() <= 540))
			tool = 6;
		
		if (tool == 3) {
			clickColor = new Color(bImage.getRGB(evt.getX(), evt.getY()));
			bucket( evt.getX(), evt.getY());
		}
		
		
		
			
		lastX = -100;
		lastY = -100;
		repaint();
	}
	
	public void mousePressed( MouseEvent evt )
	{
		if(tool == 4 || tool == 5 || tool == 6){
			if ((evt.getX() < 750 && evt.getX() > 50) && ( evt.getY() < 615 && evt.getY() > 100)) {	
				dragX = evt.getX();
				dragY = evt.getY();
				lastX = dragX;
				lastY = dragY;
			}
			
		}
		
		
	}
	
	public void mouseReleased( MouseEvent evt )
	{
		if(tool == 4){
			gLines.setColor(curColor);
			gLines.drawLine(dragX,dragY,lastX,lastY);
		}
		if(tool == 5){
			gLines.setColor(curColor);
			if( lastX > dragX && lastY > dragY){
				gLines.drawRect(dragX,dragY,lastX-dragX,lastY-dragY);
			}
			else if( lastX < dragX && lastY > dragY){
				gLines.drawRect(lastX,dragY,dragX-lastX,lastY-dragY);
			}
			else if( lastX > dragX && lastY < dragY){
				gLines.drawRect(dragX,lastY,lastX-dragX,dragY-lastY);
			}
			else if( lastX < dragX && lastY < dragY){
				gLines.drawRect(lastX,lastY,dragX-lastX,dragY-lastY);
			}
			
		}
		
		if(tool == 6){
			gLines.setColor(curColor);
			if( lastX > dragX && lastY > dragY){
				gLines.drawOval(dragX,dragY,lastX-dragX,lastY-dragY);
			}
			else if( lastX < dragX && lastY > dragY){
				gLines.drawOval(lastX,dragY,dragX-lastX,lastY-dragY);
			}
			else if( lastX > dragX && lastY < dragY){
				gLines.drawOval(dragX,lastY,lastX-dragX,dragY-lastY);
			}
			else if( lastX < dragX && lastY < dragY){
				gLines.drawOval(lastX,lastY,dragX-lastX,dragY-lastY);
			}
			
		}
	}
	
	public void mouseEntered( MouseEvent evt )
	{
	}
	
	public void mouseExited( MouseEvent evt )
	{
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Paint");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Paint canvas = new Paint();
		win.add( canvas );
		win.setVisible(true);
		canvas.init();
	}
}	
	