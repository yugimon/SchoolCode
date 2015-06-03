//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Aplus03MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public Aplus03MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public Aplus03MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;

	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;

	}

	public void calcMPH()
	{	
		double time = hours + minutes/60.0;
		mph = (double) distance / time;
		
		
	}

	public void print()
	{
		System.out.printf("%d miles in %d hour and %d minutes = %.0f MPH\n", distance,hours,minutes,mph);

	}
}
