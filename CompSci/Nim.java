import java.util.Scanner;

public class Nim
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		int pa = 3, pb = 4, pc = 5, n;
		String pile, p1, p2 = "no one", c, win = "no won";

		System.out.print("Player 1, enter your name: ");
		p1 = kb.next();
		System.out.print("Would you like to play against a computer opponent(Y/N):");
		c = kb.next();
		if (!c.equalsIgnoreCase("y"))
		{
			System.out.print("Player 2, enter your name: ");
			p2 = kb.next();
			System.out.println();
		}

		do
		{
				if (pc >= 5)
					System.out.println("	  #");
				else
					System.out.println("	   ");
				if (pb >= 4)
					System.out.print("	 #");
				else
					System.out.print("	  ");
				if (pc >= 4)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 3)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 3)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 3)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 2)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 2)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 2)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 1)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 1)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 1)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa == 0)
					System.out.print("");
				if (pb == 0)
					System.out.print("");
				if (pc == 0)
					System.out.print("");
				System.out.println("	ABC");
				System.out.println();
				System.out.print(p1+", choose a pile: ");
				pile = kb.next();
				while ((!pile.equalsIgnoreCase("a"))&&(!pile.equalsIgnoreCase("b"))&&(!pile.equalsIgnoreCase("c")))
				{
					System.out.print("Nice try, "+p1+". That is not a pile. Choose again: ");
					pile = kb.next();
				}
				System.out.print("How many to remove from pile "+pile+": ");
				n = kb.nextInt();
				
				if ( pile.equalsIgnoreCase("a") && (pa > 0))
				{
					do
					{
						if (n <= 0)
						{
							System.out.print("You must choose at least 1. How many? ");
							n = kb.nextInt();
						}
						if (n > pa)
						{
							System.out.print("Pile A doesn't have that many. try again: ");
							n = kb.nextInt();
						}

					} while ((n < 1) || (n > pa));
					pa = pa-n;
				}
				else if ( pile.equalsIgnoreCase("b") && (pb > 0))
				{
					do
					{
						if (n <= 0)
						{
							System.out.print("You must choose at least 1. How many? ");
							n = kb.nextInt();
						}
						if (n > pb)
						{
							System.out.print("Pile B doesn't have that many. try again: ");
							n = kb.nextInt();
						}

					} while ((n < 1) || (n > pb));
					pb = pb-n;
				}
				else if ( pile.equalsIgnoreCase("c") && (pc > 0))
				{
					do
					{       
						if (n <= 0)
						{
							System.out.print("You must choose at least 1. How many? ");
							n = kb.nextInt();
						}
						if (n > pc)
						{
							System.out.print("Pile C doesn't have that many. try again: ");
							n = kb.nextInt();
						}

					} while ((n < 1) || (n > pc));
					pc = pc-n;
				}
				
				
				if (pa+pb+pc==1)
				win = p1;
				else if (pa+pb+pc==0)
				win = p2;
			//end turn
			if ((pa+pb+pc>1) && (!c.equalsIgnoreCase("y")))
			{
				if (pc >= 5)
					System.out.println("	  #");
				else
					System.out.println("	   ");
				if (pb >= 4)
					System.out.print("	 #");
				else
					System.out.print("	  ");
				if (pc >= 4)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 3)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 3)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 3)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 2)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 2)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 2)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 1)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 1)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 1)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa == 0)
					System.out.print("");
				if (pb == 0)
					System.out.print("");
				if (pc == 0)
					System.out.print("");
				System.out.println("	ABC");
				System.out.println();
				System.out.print(p2+", choose a pile: ");
				pile = kb.next();
				while ((!pile.equalsIgnoreCase("a"))&&(!pile.equalsIgnoreCase("b"))&&(!pile.equalsIgnoreCase("c")))
				{
					System.out.print("Nice try, "+p1+". That is not a pile. Choose again: ");
					pile = kb.next();
				}
				System.out.print("How many to remove from pile "+pile+": ");
				n = kb.nextInt();
				if ( pile.equalsIgnoreCase("a") && (pa > 0))
				{
					do
					{
						if (n <= 0)
						{
							System.out.print("You must choose at least 1. How many? ");
							n = kb.nextInt();
						}
						if (n > pa)
						{
							System.out.print("Pile A doesn't have that many. try again: ");
							n = kb.nextInt();
						}

					} while ((n < 1) || (n > pa));
					pa = pa-n;
				}
				else if ( pile.equalsIgnoreCase("b") && (pb > 0))
				{
					do
					{
						if (n <= 0)
						{
							System.out.print("You must choose at least 1. How many? ");
							n = kb.nextInt();
						}
						if (n > pb)
						{
							System.out.print("Pile B doesn't have that many. try again: ");
							n = kb.nextInt();
						}

					} while ((n < 1) || (n > pb));
					pb = pb-n;
				}
				else if ( pile.equalsIgnoreCase("c") && (pc > 0))
				{
					do
					{       
						if (n <= 0)
						{
							System.out.print("You must choose at least 1. How many? ");
							n = kb.nextInt();
						}
						if (n > pc)
						{
							System.out.print("Pile C doesn't have that many. try again: ");
							n = kb.nextInt();
						}

					} while ((n < 1) || (n > pc));
					pc = pc-n;
				}
				if (pa+pb+pc==1)
					win = p2;
				else if (pa+pb+pc==0)
					win = p1;
			}
			else if ((pa+pb+pc>1) && (c.equalsIgnoreCase("y")))
			{
				p2 = "Computer";
				if (pc >= 5)
					System.out.println("	  #");
				else
					System.out.println("	   ");
				if (pb >= 4)
					System.out.print("	 #");
				else
					System.out.print("	  ");
				if (pc >= 4)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 3)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 3)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 3)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 2)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 2)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 2)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa >= 1)
					System.out.print("	#");
				else
					System.out.print("	 ");
				if (pb >= 1)
					System.out.print("#");
				else
					System.out.print(" ");
				if (pc >= 1)
					System.out.println("#");
				else
					System.out.println(" ");
				if (pa == 0)
					System.out.print("");
				if (pb == 0)
					System.out.print("");
				if (pc == 0)
					System.out.print("");
				System.out.println("	ABC");
				System.out.println();
				if (pa > pb && pa > pc)
				{
					pile = "a";
					System.out.println(p2+" chooses: " + pile);
					do
					{
						n = 1 + (int)(Math.random()*5);
					} while (n <= pa);
					System.out.println(p2+" removes: "+n+" from "+pile);
					pa = pa-n;
				}
				else if (pb > pa && pb > pc)
				{
					pile = "b";
					System.out.println(p2+" chooses: " + pile);
					do
					{
						n = 1 + (int)(Math.random()*5);
					} while (n <= pb);
					System.out.println(p2+" removes: "+n+" from "+pile);
					pb = pb-n;
				}
				else if (pc > pa && pc > pb)
				{
					pile = "c";
					System.out.println(p2+" chooses: " + pile);
					do
					{
						n = 1 + (int)(Math.random()*5);
					} while (n <= pc);
					System.out.println(p2+" removes: "+n+" from "+pile);
					pc = pc-n;
				}
				if (pa+pb+pc==1)
					win = p2;
				else if (pa+pb+pc==0)
					win = p1;
			}
		} while (pa+pb+pc > 1);
		System.out.println();
		if (pc >= 5)
			System.out.println("	  #");
		else
			System.out.println("	   ");
		if (pb >= 4)
			System.out.print("	 #");
		else
			System.out.print("	  ");
		if (pc >= 4)
			System.out.println("#");
		else
			System.out.println(" ");
		if (pa >= 3)
			System.out.print("	#");
		else
			System.out.print("	 ");
		if (pb >= 3)
			System.out.print("#");
		else
			System.out.print(" ");
		if (pc >= 3)
			System.out.println("#");
		else
			System.out.println(" ");
		if (pa >= 2)
			System.out.print("	#");
		else
			System.out.print("	 ");
		if (pb >= 2)
			System.out.print("#");
		else
			System.out.print(" ");
		if (pc >= 2)
			System.out.println("#");
		else
			System.out.println(" ");
		if (pa >= 1)
			System.out.print("	#");
		else
			System.out.print("	 ");
		if (pb >= 1)
			System.out.print("#");
		else
			System.out.print(" ");
		if (pc >= 1)
			System.out.println("#");
		else
			System.out.println(" ");
		if (pa == 0)
			System.out.print("");
		if (pb == 0)
			System.out.print("");
		if (pc == 0)
			System.out.print("");
		System.out.println("	ABC");
		System.out.println();

		if (win == p1)
			System.out.println(p2+" took the last piece "+p1+" wins!");
		else if (win == p2)
			System.out.println(p1+" took the last piece "+p2+" wins!");
	}
}