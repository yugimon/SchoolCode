import java.util.Scanner;

public class Refresher2
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int n, l = 10;
		String a;
		System.out.print("What is your name: ");
		a = kb.next();
		if(a.equals("Mitchell"))
		{
			l = 5;
		}
		for (n=1; n<=l ; n++)
		{
			System.out.println(a);
		}
		
	}
}