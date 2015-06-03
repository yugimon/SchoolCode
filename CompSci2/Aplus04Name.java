//© A+ Computer Science  -  www.apluscompsci.com
// what kind of ant is good at math?

import static java.lang.System.*;

public class Aplus04Name
{
	private String name;

	public Aplus04Name()
	{
		name = "";
	}

	public Aplus04Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
		name = s;
   }

	public String getFirst()
	{
		int x = name.indexOf(" ");
		return name.substring(0,x);
	}

	public String getLast()
	{
		int y = name.indexOf(" ");
		return name.substring(y+1);
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}
// an accountANT! 
