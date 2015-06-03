//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus03DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases
	Aplus03Distance test = new Aplus03Distance(1,1,2,1);
	test.calcDistance();
	test.print(); 
	
	Aplus03Distance tes = new Aplus03Distance(1,1,-2,2);
	tes.calcDistance();
	tes.print(); 
	
	Aplus03Distance te = new Aplus03Distance(1,1,0,0);
	te.calcDistance();
	te.print(); 
		
		
		
			
	}
}
