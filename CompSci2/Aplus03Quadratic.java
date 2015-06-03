//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus03Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Aplus03Quadratic()
	{
		a=0;
		b=0;
		c=0;
		rootOne=0;
		rootTwo=0;

	}

	public Aplus03Quadratic(int quadA, int quadB, int quadC)
	{
		a=quadA;
		b=quadB;
		c=quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a=quadA;
		b=quadB;
		c=quadC;

 	}

	public void calcRoots( )
	{
		rootOne = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		rootTwo = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

	}

	public void print( )
	{
			System.out.printf("rootone :: %.2f\nroottwo :: %.2f\n\n", rootOne, rootTwo);

	}
}
