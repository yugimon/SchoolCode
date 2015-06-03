import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int a, n, t = 0;
		System.out.print("Number: ");
		a = kb.nextInt();
		
		for (n=1; n<=a ; n++)
		{
			System.out.print(n + " ");
			t = t + n;
		}
		System.out.println();
		System.out.println("The sum is "+t);
		
	}
}