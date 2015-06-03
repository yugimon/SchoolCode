//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02Cube
{
	private int side;
	private int surfaceArea;

	public void setSide(int s)
	{
		side = s;
	}

	public void calculateSurfaceArea( )
	{
		int area = side * side;
		surfaceArea = area * 6;
	}

	public void print( )
	{
		System.out.printf("The surface area is :: %d\n", surfaceArea);
	}
}
