//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		double cel32 = 0.0;
		//add code to convert fahrenheit to celsius
		cel32 = fahrenheit - 32;
		celsius = cel32*((double)5/9); 
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.printf("%.2f degrees Fahrenheit == %.2f degrees Celsius\n", fahrenheit, getCelsius());
	}
}
