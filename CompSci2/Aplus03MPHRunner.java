//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus03MPHRunner
{
	public static void main( String[] args )
	{

		Aplus03MilesPerHour test = new Aplus03MilesPerHour(45, 0, 32);
		test.calcMPH();
		test.print();
		
		//add more test cases
		test.setNums(96,1,43);
		test.calcMPH();
		test.print();
		
		test.setNums(100,2,25);
		test.calcMPH();
		test.print();
		
		test.setNums(50,2,25);
		test.calcMPH();
		test.print();
		
		
	}
}
