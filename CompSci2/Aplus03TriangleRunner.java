//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner; 
import java.lang.Math.*;

public class Aplus03TriangleRunner  //this class is used to test Aplus03Triangle
{
	public static void main( String[] args )
	{

		


		Aplus03Triangle test = new Aplus03Triangle(3, 3, 3);
		test.calcPerimeter();
		test.calcArea();
		test.print();



		test.setSides(7,8,9);
		test.calcPerimeter();
		test.calcArea();
		test.print();





		test.setSides(10,9,11);
		test.calcPerimeter();
		test.calcArea();
		test.print();


	}
}
