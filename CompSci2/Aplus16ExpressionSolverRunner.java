//© A+ Computer Science  -  www.apluscompsci.com

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Aplus16ExpressionSolverRunner
{
	public static void main( String[] args )
	{
		Aplus16ExpressionSolver e = new Aplus16ExpressionSolver("3 + 5");
		System.out.println("3 + 5");
		e.solveExpression();
		System.out.print(e.toString());
		System.out.println();
		
		e.setExpression("3 * 5");
		System.out.println("3 * 5");
		e.solveExpression();
		System.out.print(e.toString());
		System.out.println();
		
		e.setExpression("3 - 5");
		e.solveExpression();
		System.out.print(e.toString());
		System.out.println();
		
		e.setExpression("3 / 5");
		e.solveExpression();
		System.out.print(e.toString());
		System.out.println();
		
		e.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		e.solveExpression();
		System.out.print(e.toString());
		System.out.println();
		
		e.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
		e.solveExpression();
		System.out.print(e.toString());
		System.out.println();
	}
}