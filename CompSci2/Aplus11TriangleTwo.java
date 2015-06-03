//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus11TriangleTwo
{
   private int size;
   private String letter;

	public Aplus11TriangleTwo()
	{
		size = 0;
		letter = "";
	}

	public Aplus11TriangleTwo( String let, int sz)
	{
		letter = let;
		size = sz;
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		for (int i=0; i<=size; i++)
		{
			for (int j=size; j>i; j--)
			{
				output += letter;
			}
			output += "\n";
		}
		return output;
	}
}
