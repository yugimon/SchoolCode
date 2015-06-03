//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus05Distance
{
	private int x1,y1,x2,y2;

	public Aplus05Distance()
	{
		x1 = 0;
		x2=0;
		y1=0;
		y2=0;


	}

	public Aplus05Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		x2 = xTwo;
		y1=yOne;
		y2=yTwo;
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		x2 = xTwo;
		y1=yOne;
		y2=yTwo;
	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		distanceA = Math.sqrt((x1*x1) + (y1*y1));
		distanceB = Math.sqrt((x2*x2) + (y2*y2));
		String result = " ";
		if (distanceA > distanceB)
			result="B";
		else if (distanceA < distanceB)
			result="A";
		else
			result="Neither";
		
		return result;
	}
	
	public String toString()
	{
		return ""+x1+"\n"+y1+"\n"+x2+"\n"+y2+"\n"+determineClosest()+" IS CLOSER\n";
	}
}
