//© A+ Computer Science  -  www.apluscompsci.com
// how many programmers does it take to change a light bulb?
import static java.lang.System.*;

public class Aplus11Box
{
   private int size;

	public Aplus11Box()
	{
		size = 0;
	}

	public Aplus11Box(int count)
	{
		size = count;
	}

	public void setSize(int count)
	{
		size = count;
	}

	public int getSize()
	{
		return size;
	}

	public String toString()
	{
		String output="";
		for (int i=0; i<size; i++)
		{
			for (int j=size; j>i; j--)
			{
					output += "*";
			}
			for (int k=0; k<=i; k++)
			{
				output += "#";
			}
			
			output += "\n";
		}
		return output;
	}
}
// none, that’s a hardware problem
