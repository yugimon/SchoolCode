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
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit");
			System.out.println();
			System.out.print(">");
			a = kb.nextInt();
			System.out.println();
			if(a==1)
				func1();
			else if(a==2)
				func2();
			else
				a=3;	
		}while (a!= 3);
	}
	public static void func1()
	{
		for( int w=0 ; w<=5 ; w++)
			{
				for( int e=0 ; e <10; e++ )
				{
					
					int q = w+e;
					int we = 10*w + 1*e;
					if( q>10 && we <=56 )
						System.out.println(we+", "+w+"+"+e+" = "+q);	
				}
				
			}
	}
	public static void func2()
	{
		for( int w=1 ; w<=9 ; w++)
			{
				for( int e=0 ; e <10; e++ )
				{
					
					int q = w+e;
					int we = 10*w + 1*e;
					int ew = 10*e + 1*w;
					int p = we - ew;
					if(p==q)
						System.out.println(we);
				}
			}
	}
}