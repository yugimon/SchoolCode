//© A+ Computer Science  -  www.apluscompsci.com

// what do you call a CompSci class with no one in it?
import static java.lang.System.*;
import java.util.Scanner;

public class Aplus05StringOddOrEven
{
	private String word;

	public Aplus05StringOddOrEven()
	{
		word = "";
	}

	public Aplus05StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if (word.length()%2 == 0)
			return true;
		return false;
	}

 	public String toString()
 	{
		String output = "";
		if (isEven())
			output = " is even.";
		else
			output = " is odd.";
 		
 		return output;
	}
}
//Computer Scilence!