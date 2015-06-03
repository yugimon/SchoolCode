//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Aplus02Line(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1; 
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope = (double)(yTwo-yOne)/(xTwo-xOne);


	}

	public void print( )
	{
		System.out.printf("The slope is :: %.2f\n", slope);


	}
}
