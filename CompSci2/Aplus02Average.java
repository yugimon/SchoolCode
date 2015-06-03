//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one=num1;
		two=num2;
	}

	public void average( )
	{
		double sum=0;
		sum = one + two;
		average = sum/2;

	}
	public void print( )
	{
		System.out.printf("%.1f + %.1f has an average of %.2f\n", one, two, average);
	}
}
