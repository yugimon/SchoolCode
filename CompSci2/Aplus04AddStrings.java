//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus04AddStrings
{
   private String first, last;
   private String sum;

   public Aplus04AddStrings()
   {
		first="";
		last="";
		sum="";
   }

   public Aplus04AddStrings(String one, String two)
   {
		first = one;
		last = two;
   }

   public void setStrings(String one, String two)
   {
		first= one;
		last = two;
   }

 	public void add( )
 	{
		sum = first + " " + last;
	}

 	public String toString()
 	{
 		String output="first :: "+first+"\nlast :: "+last+"\nsum :: "+sum+"\n";
 		return output;
	}
}
