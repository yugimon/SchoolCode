//© A+ Computer Science  -  www.apluscompsci.com
import java.lang.Math;

public class Aplus02Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = Math.PI*(radius*radius);
	}

	public void print( )
	{
		System.out.printf("The area is :: %.4f\n", area);
	}
}
