//© A+ Computer Science  -  www.apluscompsci.com

import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Aplus14TheRace
{
	private int one;
	private int two;
	private int oneCount;
	private int twoCount;
	private int[] track;
	private int turn;
	private int winner;
	
	public Aplus14TheRace()
	{
		one = 0;
		two = 0;
		oneCount = 0;
		twoCount = 0;
		track = new int[18];
		turn = 1;
		winner = 0;
	}
	
	public boolean turn()
	{
		
		if (turn == 1){
			track[one] = 0;
			one = one + (int)(Math.random()*6);
			if (one >= 17)
			{
				one = 0;
				oneCount++;
			}
			if (track[one] == 2){
				two = 0;
			}
			
			track[one] = 1;
			turn++;
		}
		else if (turn == 2){ 
			track[two] = 0;
			two = two + (int)(Math.random()*6);
			if (two >= 17)
			{
				two = 0;
				twoCount++;
			}
			if (track[two] == 1){
				one = 0;
			}

			track[two] = 2;
			turn--;
		}
		if (oneCount == 5 || twoCount == 5){
			return false;
		}
		return true;
	}
	
	public String getWinner()
	{	
		if(oneCount == 5)
			return "1 Wins!";
		else if(twoCount == 5)
			return "2 Wins!";
			
		return "";
	} 
  	
	public String toString()
	{
		return Arrays.toString( track ) + " one count = " + oneCount + " twoCount = " + twoCount;
	}
}
