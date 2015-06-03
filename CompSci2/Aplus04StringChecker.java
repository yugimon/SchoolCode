//© A+ Computer Science  -  www.apluscompsci.com
// why do anteaters never get sick;
import static java.lang.System.*;

public class Aplus04StringChecker
{
	private String word;

	public Aplus04StringChecker()
	{
		word = "";
	}

	public Aplus04StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
		word = s;
   }

	public boolean findLetter(char c)
	{
		if (word.indexOf(c) == -1)
			return false;
		return true;
	}

	public boolean findSubString(String s)
	{
		if (word.indexOf(s) == -1)
			return false;
		return true;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}
// they have lots of ANTibodies inside them!
