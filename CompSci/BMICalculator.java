import java.util.Scanner;

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double feet, inch, lbs, h, bmi;

		System.out.print( "Your height (feet only) : " );
		feet = keyboard.nextDouble();

		System.out.print( "You height (inches only) : " );
		inch = keyboard.nextDouble();

		System .out.print( "You weight in pounds: " );
		lbs = keyboard.nextDouble();

		h = feet * 12 + inch;

		bmi = ( lbs / (h*h) )*703;

		System.out.println( "Your BMI is " + bmi );
	}
}