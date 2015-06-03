//© A+ Computer Science  -  www.apluscompsci.com

// I attached all my watchs together to make a belt, Coral
// Please don't dad...
// It was a Waist of Time...
// A waist of time, Coral!

import java.util.Scanner;

public class Aplus14Histogram
{
	//add and int[] array instance variable
	private int[] numCount; 
	//constructor
	public Aplus14Histogram(String chop)
	{
		int i = 0;
		String[] values = chop.split(" ");
		numCount = new int[values.length];
		for ( String s : values )
		{
			numCount[i] = Integer.valueOf(s);
			i++;
		}
			
	}
	//set method
	public void setList(String chop)
	{
		int i = 0;
		String[] values = chop.split(" ");
		numCount = new int[values.length];
		for ( String s : values )
		{
			numCount[i] = Integer.valueOf(s);
			i++;
		}
			
	}
	public String toString()
	{
		String hist = "";
		int n = 0;
		for(int k = 0; k <= 9; k++){
			for(int i = 0; i < numCount.length;i++){
				if (numCount[i] == k){
					n++;
				}
			}
			hist += k+" - "+n+"\n";
			n = 0;
		}
		return hist;
	}
	//toString method
}


