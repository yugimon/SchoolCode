//© A+ Computer Science  -  www.apluscompsci.com
import java.util.*;
import java.math.BigInteger;
import java.math.*;

public class Aplus14Fibonacci
{
	//instance variable
	private static BigInteger[] fib;
	private static BigInteger nac;
	//constructors
	public Aplus14Fibonacci(int size)
	{
		fib = new BigInteger[size+1];
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("0");
		BigInteger n3 = new BigInteger("1");
		for (int i = 0; i < size; i++){
			n3 = n1.add(n2);
			n1 = n2;
			n2 = n3;
			fib[i] = n3;
		}
	}
	//set method
	public void set(int size)
	{
		fib = new BigInteger[size];
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("0");
		BigInteger n3 = new BigInteger("1");
		for (int i = 0; i < size; i++){
			n3 = n1.add(n2);
			n1 = n2;
			n2 = n3;
			fib[i] = n3;
		}
	}
	//get method
	public void get(int num)
	{
		if (fib.length >= num)
			nac = fib[num-1];
		else
			nac = new BigInteger("-1");
	}
	
	//toString
	public String toString()
	{
		String output = "";
		output = nac + "";
		return output;
	}
}
