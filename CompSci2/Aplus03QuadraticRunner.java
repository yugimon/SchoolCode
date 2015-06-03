//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus03QuadraticRunner
{
	public static void main( String[] args )
   {
   	//add test cases
   	Aplus03Quadratic test = new Aplus03Quadratic(5,-8,3);
	test.calcRoots();
	test.print(); 
	
	Aplus03Quadratic te = new Aplus03Quadratic(3,2,-7);
   	te.calcRoots();
	te.print(); 
	
	Aplus03Quadratic tes = new Aplus03Quadratic(9,6,1);
   	tes.calcRoots();
	tes.print(); 
		
		
	}
}
