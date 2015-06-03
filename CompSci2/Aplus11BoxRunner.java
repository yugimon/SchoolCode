//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus11BoxRunner
{
   public static void main( String args[] )
   {
		Aplus11Box box = new Aplus11Box(3);
		out.println(box.toString());
		
		box.setSize(4);
		out.println(box.toString());
		
		box.setSize(5);
		out.println(box.toString());
		
		box.setSize(2);
		out.println(box.toString());
		
		box.setSize(1);
		out.println(box.toString());
	}
}
