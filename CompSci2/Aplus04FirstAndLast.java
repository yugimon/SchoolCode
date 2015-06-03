//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus04FirstAndLast
{
	private String word;

	public Aplus04FirstAndLast(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{	
		
		return word.charAt(0) + "";
	}
	
	public String getLast()
	{
		return word.charAt(word.length()-1)+"\n";
	}

 	public String toString()
 	{
 		String output= word;
 		return output;
	}
}
