//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02Sum
{
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2)
	{
		one=num1;
		two=num2;
	}

	public void sum( )
	{
		sum = one + two;
	}

	public void print( )
	{
		System.out.printf("%.1f + %.1f == %.2f\n", one, two, sum);
	}
}
