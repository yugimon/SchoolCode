//© A+ Computer Science  -  www.apluscompsci.com

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Aplus16ExpressionSolver
{
	//add in instance variables
	ArrayList<String> k = new ArrayList<String>();
	

	public Aplus16ExpressionSolver(String s)
	{
		setExpression(s);
	}

	public void setExpression(String s)
	{
		for ( String q : s.split(" ") )
			k.add(q);
	}

	public void solveExpression()
	{
		int i = 0;
		int t = 0;
		while (k.size() > 1)
		{
			System.out.println("1");
			while( (k.indexOf("*") > -1) && (k.indexOf("/") > -1))
			{
				System.out.println("\t2");
				if ((k.indexOf("*") < k.indexOf("/")) && k.indexOf("/") > 0) {
					System.out.println("\t/");
					i = k.indexOf("/");
					t = Integer.parseInt(k.get(i-1)) / Integer.parseInt(k.get(i+1));
					k.set(i,""+t);
					k.remove(i-1);
					k.remove(i);
				}
				else if ((k.indexOf("*") > k.indexOf("/")) && k.indexOf("*") > 0) {
					System.out.println("\t*");
					i = k.indexOf("*");
					t = Integer.parseInt(k.get(i-1)) * Integer.parseInt(k.get(i+1));
					k.set(i,""+t);
					k.remove(i-1);
					k.remove(i);
				}
			}
			while( (k.indexOf("+") > -1) && (k.indexOf("-") > -1))
			{
				System.out.println("\t\t3");
				if ((k.indexOf("+") < k.indexOf("-")) && k.indexOf("-") > 0) {
					i = k.indexOf("-");
					t = Integer.parseInt(k.get(i-1)) - Integer.parseInt(k.get(i+1));
					k.set(i,""+t);
					k.remove(i-1);
					k.remove(i);
				}
				else if ((k.indexOf("+") > k.indexOf("-")) && k.indexOf("+") > 0) {
					i = k.indexOf("+");
					t = Integer.parseInt(k.get(i-1)) + Integer.parseInt(k.get(i+1));
					k.set(i,""+t);
					k.remove(i-1);
					k.remove(i);
				}
			}
		}
	}

	public String toString( )
	{
		return k.get(0);
	}
}