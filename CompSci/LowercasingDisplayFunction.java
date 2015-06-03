import java.util.Scanner;
public class LowercasingDisplayFunction
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int n;
		String s;
		System.out.print("Message: ");
		s = kb.nextLine();
		System.out.print("Quantity: ");
		n = kb.nextInt();
		display(s,n);
		
	}
	public static void display( String s, int n )
	{
		String b;
		b = s.toLowerCase();
		for (int a = 1; a <= n; a++)
			System.out.println(b);
	}
}