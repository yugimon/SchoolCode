//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus03Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Aplus03Distance()
	{
		xOne=0;
		xTwo=0;
		yOne=0;
		yTwo=0;
		distance=0.0;


	}

	public Aplus03Distance(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		xTwo=x2;
		yOne=y1;
		yTwo=y2;


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		xTwo=x2;
		yOne=y1;
		yTwo=y2;


	}

	public void calcDistance()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));


	}

	public void print( )
	{
		System.out.printf("distance == %.3f\n\n",distance);


	}
}
