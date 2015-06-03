import java.util.Scanner;

public class Keychains1
{
	public static void main( String[] args )
	{
		int a;
		Scanner kb = new Scanner(System.in);
		System.out.println("Ye Olde Keychain Shoppe");
		do
		{
			System.out.println();
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains to Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.println();
			System.out.print("Please enter your choice: ");
			a = kb.nextInt();
			System.out.println();
			if (a == 1)
				add_keychains();
			else if (a == 2)
				remove_keychains();
			else if (a == 3)
				view_order();
			else if (a == 4)
				checkout();
			else
				System.out.println("Not a choice. Choose again!");
		} while (a != 4);
		
	}
	
	public static void add_keychains()
	{
		System.out.println("ADD KEYCHAINS");
	}
	
	public static void remove_keychains()
	{
		System.out.println("REMOVE KEYCHAINS");
	}
	
	public static void view_order()
	{
		System.out.println("VIEW ORDER");
	}
	
	public static void checkout()
	{
		System.out.println("CHECKOUT");
	}
}