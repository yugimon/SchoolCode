//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus11TriangleFour
{
   private int size;
   private String letter;

	public Aplus11TriangleFour()
	{
		size = 0;
		letter = "";
	}

	public Aplus11TriangleFour(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter() 
	{
		return "#";
	}

	public String toString()
	{
	/*
		String output = "";
		for (int q = 0; q<0; q++)
			output+= " ";
		for (int w = 0; w<3; w++)
			output+= letter;
		output += "\n";
		for (int q = 0; q<1; q++)
			output+= " ";
		for (int w = 0; w<2; w++)
			output+= letter;
		output += "\n";
		for (int q = 0; q<2; q++)
			output+= " ";
		for (int w = 0; w<1; w++)
			output+= letter;
		output += "\n";
		return output;
	*/	
	
		String output="";
		for (int i=0; i<=size; i++)
		{
			for (int k=0; k<i; k++)
			{
				output += " ";
			}
			for (int j=size; j>i; j--)
			{
				output += letter;
			}
			output += "\n";
		}
		return output;
	
	}	
}
