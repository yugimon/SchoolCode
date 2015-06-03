//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus11TriangleFiveRunner
{
   public static void main(String args[])
   {
		Aplus11TriangleFive tri = new Aplus11TriangleFive('C',4);
		out.println(tri.toString());
		
		tri.setLetter('A');
		tri.setAmount(5);
		out.println(tri.toString());
		
		tri.setLetter('B');
		tri.setAmount(7);
		out.println(tri.toString());
		
		tri.setLetter('X');
		tri.setAmount(6);
		out.println(tri.toString());
		
		tri.setLetter('Z');
		tri.setAmount(8);
		out.println(tri.toString());
	}
}
