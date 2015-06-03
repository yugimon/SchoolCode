//© A+ Computer Science  -  www.apluscompsci.com
import static java.lang.System.*;
import java.util.Scanner;

public class Aplus11TriangleFourRunner
{
   public static void main( String args[] )
   {
		Aplus11TriangleFour test = new Aplus11TriangleFour(3,"R");
		out.println(test.toString());
		
		test.setTriangle("B",4);
		out.println(test.toString());
		
		test.setTriangle("X",5);
		out.println(test.toString());
		
		test.setTriangle("E",2);
		out.println(test.toString());
		
		test.setTriangle("T",1);
		out.println(test.toString());
   }
}
