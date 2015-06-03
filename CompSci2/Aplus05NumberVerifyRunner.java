//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;
import java.util.Scanner;

public class Aplus05NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("Number :: 5");
		System.out.println("5 is odd :: " + Aplus05NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + Aplus05NumberVerify.isEven(5));
		System.out.println();
		
		//add in more test cases
		System.out.println("Number :: 111");
		System.out.println("111 is odd :: " + Aplus05NumberVerify.isOdd(111));
		System.out.println("111 is even :: " + Aplus05NumberVerify.isEven(111));
		System.out.println();
		
		System.out.println("Number :: 2000");
		System.out.println("2000 is odd :: " + Aplus05NumberVerify.isOdd(2000));
		System.out.println("2000 is even :: " + Aplus05NumberVerify.isEven(2000));
		System.out.println();
		
		System.out.println("Number :: -99");
		System.out.println("-99 is odd :: " + Aplus05NumberVerify.isOdd(-99));
		System.out.println("-99 is even :: " + Aplus05NumberVerify.isEven(-99));
		System.out.println();
		
		System.out.println("Number :: 1111");
		System.out.println("1111 is odd :: " + Aplus05NumberVerify.isOdd(1111));
		System.out.println("1111 is even :: " + Aplus05NumberVerify.isEven(1111));
		System.out.println();
		
		System.out.println("Number ::-850 ");
		System.out.println("-850 is odd :: " + Aplus05NumberVerify.isOdd(-850));
		System.out.println("-850 is even :: " + Aplus05NumberVerify.isEven(-850));
		System.out.println();
	}
}
