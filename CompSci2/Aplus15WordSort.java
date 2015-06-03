//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Arrays;
import static java.lang.System.*; 

public class Aplus15WordSort
{
	private String[] wordRay;

	public Aplus15WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString( )
	{
		String output="";
		for (int i=0; i<wordRay.length;i++)
			output += "word " + i +" :: "+wordRay[i]+"\n";
		return output+"\n\n";
	}
}
