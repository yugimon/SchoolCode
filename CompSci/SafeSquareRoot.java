import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double x, y, z;

		System.out.print("Give me a number, and I shall find the square root of it. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();
		z =	Math.abs(x);
		y = Math.sqrt(z);

		if ( x < 0 )
		System.out.println("The square root of "+x+" is "+y+"i");
		else
		System.out.println("The square root of "+x+" is "+y);
	}
}