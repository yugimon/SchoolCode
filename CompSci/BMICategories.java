import java.util.Scanner;

public class BMICategories
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

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 )
		{
			System.out.println( "very severly underweight" );
		}
		else if ( bmi <= 16.0 )
		{
			System.out.println( "Severely underweight" );
		}
		else if ( bmi < 18.5 )
		{
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 )
		{
			System.out.println( "Normal weight" );
		}
		else if ( bmi < 30.0 )
		{
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 )
		{
			System.out.println( "moderateley obese" );
		}
		else if ( bmi < 40.0 )
		{
			System.out.println( "Severely obese" );
		}
		else
		{
			System.out.println( "very severely/\"Morbidly\" obese" );
		}
	}
}