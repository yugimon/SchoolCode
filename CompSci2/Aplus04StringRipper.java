//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus04StringRipper
{
	private String word;
	
	public Aplus04StringRipper()
	{
		word = "";
	}

	public Aplus04StringRipper(String s)
	{
		word = s;
	}
	
   public void setString(String s)
   {
		word = s;
   }	

	public String ripString(int x, int y)
	{
		return word.substring(x,y) + "";
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}
