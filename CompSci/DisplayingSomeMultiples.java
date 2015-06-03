import java.util.Scanner;

public class DisplayingSomeMultiples
{
	public static void main( String[] args ) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		 System.out.print("Choose a number: ");
		 int n = kb.nextInt();
		 
		 for ( int b = 1; b<=12; b++)
		 {
		 	int c = n*b;
		 	System.out.println(n+ "x" + b + " = " + c);
		 }
	}
}