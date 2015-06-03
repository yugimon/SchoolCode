import java.util.Scanner;

public class Keychains3
{
	public static void main( String[] args )
	{
		int a, kc = 0, bs = 5, pks = 1;
		double ppk = 10.00, tax = 1.0825;
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
				kc = add_keychains(kc);
			else if (a == 2)
				kc = remove_keychains(kc);
			else if (a == 3)
				view_order(kc, ppk, tax, bs, pks);
			else if (a == 4)
				checkout(kc, ppk, tax, bs, pks);
			else
				System.out.println("Not a choice. Choose again!");
		} while (a != 4);
		
	}
	
	public static int add_keychains(int kc)
	{
		int add = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("You have "+kc+" keychains. How many to add? ");
		add = kb.nextInt();
		kc = kc+add;
		System.out.println("You now have "+kc+" keychains."); 
		return kc;
		
	}
	
	public static int remove_keychains(int kc)
	{
		int remove = 0;
		Scanner kb = new Scanner(System.in);
		

		System.out.print("You have "+kc+" keychains. How many to remove? ");
		remove = kb.nextInt();
		if (remove > kc)
			remove = kc;
		kc = kc-remove;
		System.out.println("You now have "+kc+" keychains."); 
		return kc;
	}
	
	public static void view_order(int kc, double ppk, double tax, int bs, int pks)
	{
		double tc=0;
		System.out.println("You have "+kc+" keychains.");
		System.out.println("Keychains cost $10 each.");
		tc = ppk+pks;
		tc = kc*tc;
		tc = tc+bs;
		tc = tc*tax;
		System.out.println("Total cost is $"+tc+".");
	}
	
	public static void checkout(int kc, double ppk, double tax, int bs, int pks)
	{
		String name;
		Scanner kb = new Scanner(System.in);
		System.out.println("CHECKOUT");
		System.out.println();
		System.out.print("What is your name? ");
		name = kb.next();
		view_order(kc,ppk,tax,bs,pks);
		System.out.println("Thanks for your order, "+name+"!");
	}
}