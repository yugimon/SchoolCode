import java.util.Scanner;

public class NumberPuzzles2
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		
		int a = 0;
		
		do
		{
			System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2) Find two digit numbers minus number reversed which equals sum digits");
			System.out.println("3) Quit");
			System.out.println();
			System.out.print(">");
			a = kb.nextInt();
			System.out.println();
			if (a == 1)
				func1();
			else if (a == 2)
				func2();
			else
				a = 3;
		}while (a != 3);
	}
	
	public static void func1()
	{
		for( int e = 0 ; e <= 5; e++ )
		{
			for( int k = 0 ; k < 10; k++ )
			{
				int q = e+k;
				int ek = 10*e + 1*k;
				if( q > 10 && ek <= 56 )
					System.out.println(ek+", "+e+"+"+k+" = "+q);
			}
		}
	}
	public static void func2()
	{
		for( int e = 1; e <= 9 ; e++)
		{
			for( int k = 0; k < 10; k++)
			{
				int q = e+k;
				int ek = 10*e + 1*k;
				int ke = 10*k + 1*e;
				int d = ek - ke;
				if(d == q)
					System.out.println(ek);
			}
		}
	}
}