//© A+ Computer Science  -  www.apluscompsci.com

import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Quarters
{
	private int p1;
	private int p2;
	private int p3;
	private int p4;
	private int d;
	private int turn;
	private int pot;
	private int winner;
	
	public Quarters()
	{
		turn = 1;
		p1 = 3;
		p2 = 3;
		p3 = 3;
		p4 = 3;
		pot = 0;
	}
	
	public boolean turns()
	{
		
		if (turn == 1){
			if (p1 >= 3) {
				p1Turn();
				p1Turn();
				p1Turn();
			}
			else if(p1 == 2)
			{
				p1Turn();
				p1Turn();
			}
			else if(p1 == 1)
			{
				p1Turn();
			}
			if(p1 > 0 && p2 == 0 && p3 == 0 && p4 == 0)
				return false;
			turn++;
		}
		
		else if (turn == 2){ 
			if (p2 >= 3) {
				p2Turn();
				p2Turn();
				p2Turn();
			}
			else if(p2 == 2)
			{
				p2Turn();
				p2Turn();
			}
			else if(p2 == 1)
			{
				p2Turn();
			}
			if(p1 == 0 && p2 > 0 && p3 == 0 && p4 == 0)
				return false;
			turn++;
		}
		else if (turn == 3){ 
			if (p3 >= 3) {
				p3Turn();
				p3Turn();
				p3Turn();
			}
			else if(p3 == 2)
			{
				p3Turn();
				p3Turn();
			}
			else if(p3 == 1)
			{
				p3Turn();
			}
			if(p1 == 0 && p2 == 0 && p3 > 0 && p4 == 0)
				return false;
			turn++;
		}
		else if (turn == 4){ 
			if (p4 >= 3) {
				p4Turn();
				p4Turn();
				p4Turn();
			}
			else if(p4 == 2)
			{
				p4Turn();
				p4Turn();
			}
			else if(p4 == 1)
			{
				p4Turn();
			}
			if(p1 == 0 && p2 == 0 && p3 == 0 && p4 > 0)
				return false;
			turn = 1;
		}
		if(p1 == 0 && p2 == 0 && p3 == 0 && p4 == 0){
			System.out.println("No one wins! New game with same pot");
			p1 = 3;
			p2 = 3;
			p3 = 3;
			p4 = 3;
		}
		return true;
	}
	
	public int dRoll()
	{
		int die = 1+(int)(Math.random()*6);
		return die;
	}
	public void p1Turn()
	{
		d = dRoll();
		if(d == 4)
		{
			p1--;
			p4++;
		}
		else if(d == 5)
		{
			p1--;
			pot++;
		}
		else if(d == 6)
		{
			p1--;
			p2++;
		}
	}
	public void p2Turn()
	{
		d = dRoll();
		if(d == 4)
		{
			p2--;
			p1++;
		}
		else if(d == 5)
		{
			p2--;
			pot++;
		}
		else if(d == 6)
		{
			p2--;
			p3++;
		}
	}
	public void p3Turn()
	{
		d = dRoll();
		if(d == 4)
		{
			p3--;
			p2++;
		}
		else if(d == 5)
		{
			p3--;
			pot++;
		}
		else if(d == 6)
		{
			p3--;
			p4++;
		}
	}
	public void p4Turn()
	{
		d = dRoll();
		if(d == 4)
		{
			p4--;
			p3++;
		}
		else if(d == 5)
		{
			p4--;
			pot++;
		}
		else if(d == 6)
		{
			p4--;
			p1++;
		}
	}
	
	public String getWinner()
	{	
		if(p1 > 0 && p2 == 0 && p3 == 0 && p4 == 0){
			return "Player one wins the pot of "+pot+"quarters";
		}
		else if(p1 == 0 && p2 > 0 && p3 == 0 && p4 == 0){
			return "Player two wins the pot of "+pot+"quarters";
		}
		else if(p1 == 0 && p2 == 0 && p3 > 0 && p4 == 0){
			return "Player three wins the pot of "+pot+"quarters";
		}
		else if(p1 == 0 && p2 == 0 && p3 == 0 && p4 > 0){
			return "Player four wins the pot of "+pot+"quarters";
		}
		return "";
	} 
  	
	public String toString()
	{
		return "P1: "+p1+"q P2: "+p2+"q P3: "+p3+"q P4: "+p4+"q   Pot: "+pot+"q";
	}
}
