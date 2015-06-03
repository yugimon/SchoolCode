import java.util.Scanner;

public class Refresher
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int n;
		String a;
		System.out.print("What is your name: ");
		a = kb.next();
		if(a.equals("Mitchell"))
		{
			for (n=1; n<=5 ; n++)
			{
				System.out.println(a);
			}
		}
		else
		{
			for (n=1; n<=10 ; n++)
			{
				System.out.println(a);
			}
		}
		
	}
}