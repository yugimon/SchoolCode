import java.util.Scanner;

public class BabyNim
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		
		int pa = 5, pb = 5, pc = 5, n;
		String pile;
		
		do
		{
			System.out.println("A: "+pa+"   B: "+pb+"   C: "+pc);
			System.out.println();
			System.out.print("Choose a pile: ");
			pile = kb.next();
			System.out.print("How many to remove from pile "+pile+": ");
			n = kb.nextInt();
			if ( pile.equalsIgnoreCase("a"))
				pa = pa-n;
			else if ( pile.equalsIgnoreCase("b"))
				pb = pb-n;
			else if ( pile.equalsIgnoreCase("c"))
				pc = pc-n;
		}while ((pa > 0) || (pb > 0) || (pc > 0));
		System.out.println();
		System.out.println("All piles are empty. Great job!");
	}
}